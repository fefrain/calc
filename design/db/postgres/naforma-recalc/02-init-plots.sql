SET search_path TO naforma1, public;

------------------------------------------------------------
--- FIELD PLOTS
------------------------------------------------------------

-- Copy plot table
DROP TABLE IF EXISTS _plot;

CREATE TABLE _plot AS 
SELECT * 
FROM plot;

alter table _plot
drop column district,
drop column region;


-- CLEAN: Set plots with observations as accessible
update _plot
set accessibility = '0'
where 
        accessibility != '0'
    and
        exists (select tree_id from tree t where t.plot_id = _plot.plot_id);

update _plot
set accessibility = '0'
where 
        accessibility != '0'
    and
        exists (select stump_id from stump s where s.plot_id = _plot.plot_id);

update _plot
set accessibility = '0'
where 
        accessibility != '0'
    and
        exists (select dead_wood_id from dead_wood dw where dw.plot_id = _plot.plot_id);

update _plot
set accessibility = '0'
where 
        accessibility != '0'
    and
        exists (select bamboo_id from bamboo b where b.plot_id = _plot.plot_id);

-- CLEAN: Set default direction and distance
update _plot
set centre_dir = 0, centre_dist = 0
where (centre_dir=99 and centre_dist=99) 
        or centre_dir is null or centre_dist is null
        or centre_dist=0;

-- CLEAN: Set defaults for missing codes
update _plot
set catchment = '0'  -- Bare land
where catchment is null and accessibility = '0';

update _plot
set erosion = '0'  -- No erosion
where erosion is null and accessibility = '0';

update _plot
set ownership_type = '90'  -- Not known
where ownership_type is null and accessibility = '0';

update _plot
set grazing = '0'  -- No grazing
where grazing is null and accessibility = '0' and vegetation_type >= '401';

-- Replace vt 506 with 504?
--select count(*) from _plot where _plot.vegetation_type='506'

-- Assign cluster code and visit type to field plots 
ALTER TABLE _plot
ADD COLUMN cluster VARCHAR(255),
ADD COLUMN measurement VARCHAR(255);

UPDATE _plot
SET cluster = c.id, measurement = c.measurement
FROM cluster c
WHERE c.cluster_id = _plot.cluster_id;

-- CLEAN: Set default subplot code to 'A'
update _plot
set subplot = 'A'
where subplot is null;

-- CLEAN: Set default share to 100%
update _plot
set share = 100
where share is null;

-- CLEAN: Set vegtype of cluster in Kili incorrectly marked as Mangrove Forest to Forest: Humid montane
UPDATE _plot
SET vegetation_type = '101'
WHERE cluster = '188_69';

-- Convert theoretical plot locations to PostGIS points in WGS84 
ALTER TABLE _plot
ADD COLUMN location Geometry(Point,4326);

UPDATE _plot
SET location = ST_Transform(
        ST_SetSRID(ST_Point(location_x, location_y), substring(location_srs from '[0-9]+$')::integer)
        , 4326);

-- Calculate actual plot center using GPS reading and reported dir and dist
ALTER TABLE _plot
ADD COLUMN centre_location Geometry(Point,4326);

UPDATE _plot
SET centre_location = ST_Project( Geography(location), centre_dist, radians(centre_dir) )::geometry;

-- Assign stratum to field plots 
ALTER TABLE _plot
ADD COLUMN stratum INTEGER;

UPDATE _plot
SET stratum = s.stratum
FROM _sampling_design s
WHERE s.cluster = _plot.cluster AND s.plot::varchar = _plot.no;

-- Report unknown plots
SELECT cluster, no AS plot
FROM _plot
WHERE stratum is null;

-- Assign district to field plots
ALTER TABLE _plot
ADD COLUMN district_id INTEGER;

UPDATE _plot
SET district_id = a.aoi_id
FROM calc.aoi a 
WHERE ST_Contains(a.aoi_shape, centre_location)
AND a.aoi_hierarchy_level_id = 3;

-- Report unmatched plots
SELECT cluster, no AS plot
FROM _plot 
WHERE district_id IS NULL;

-- Assign region to field plots
ALTER TABLE _plot
ADD COLUMN region_id INTEGER;

UPDATE _plot
SET region_id = a.aoi_parent_id
FROM calc.aoi a 
WHERE a.aoi_id = district_id;

-- Assign zone to field plots
ALTER TABLE _plot
ADD COLUMN zone_id INTEGER;

UPDATE _plot
SET zone_id = a.aoi_parent_id
FROM calc.aoi a 
WHERE a.aoi_id = region_id;

-- Assign country to field plots
ALTER TABLE _plot
ADD COLUMN country_id INTEGER;

UPDATE _plot
SET country_id = a.aoi_parent_id
FROM calc.aoi a 
WHERE a.aoi_id = zone_id;

-- Report unmatched plots
SELECT COUNT(*)
FROM _plot 
WHERE country_id IS NULL;

-- CLEAN: Max slope = 80
update _plot
set slope = 80
where slope > 80;

-- CLEAN: Default share = 100
update _plot
set share = 100
where share is null;

-- CLEAN: Assume slope of 0 if missing
update _plot 
set slope = 0
where slope is null;

-- Reduce slope to steps of 5
update _plot
set slope = round(slope/5)*5;

-- Create correction for incorrect slope tables
ALTER TABLE _plot
ADD COLUMN slope_cf double precision;

update _plot
set slope_cf = cos(atan(slope / 100.0)) / cos(radians(0.9 * slope));

-- Calculate plot section areas
ALTER TABLE _plot
ADD COLUMN section_area double precision;

update _plot
set section_area = 15.0 * 15.0 * pi() * slope_cf * (share / 100.0);
