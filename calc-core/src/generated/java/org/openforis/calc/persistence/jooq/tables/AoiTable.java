/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class AoiTable extends org.jooq.impl.UpdatableTableImpl<org.openforis.calc.persistence.jooq.tables.records.AoiRecord> {

	private static final long serialVersionUID = -700435309;

	/**
	 * The singleton instance of calc.aoi
	 */
	public static final org.openforis.calc.persistence.jooq.tables.AoiTable AOI = new org.openforis.calc.persistence.jooq.tables.AoiTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.AoiRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.AoiRecord.class;
	}

	/**
	 * The table column <code>calc.aoi.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.aoi.aoi_level_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT aoi__aoi_level_fkey
	 * FOREIGN KEY (aoi_level_id)
	 * REFERENCES calc.aoi_level (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, java.lang.Integer> AOI_LEVEL_ID = createField("aoi_level_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.aoi.parent_aoi_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT aoi__parent_aoi_fkey
	 * FOREIGN KEY (parent_aoi_id)
	 * REFERENCES calc.aoi (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, java.lang.Integer> PARENT_AOI_ID = createField("parent_aoi_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.aoi.code</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, java.lang.String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.aoi.name</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.aoi.shape</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, java.lang.Object> SHAPE = createField("shape", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("USER-DEFINED"), this);

	/**
	 * The table column <code>calc.aoi.total_area</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, java.math.BigDecimal> TOTAL_AREA = createField("total_area", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The table column <code>calc.aoi.land_area</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, java.math.BigDecimal> LAND_AREA = createField("land_area", org.jooq.impl.SQLDataType.NUMERIC, this);

	public AoiTable() {
		super("aoi", org.openforis.calc.persistence.jooq.CalcSchema.CALC);
	}

	public AoiTable(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.CalcSchema.CALC, org.openforis.calc.persistence.jooq.tables.AoiTable.AOI);
	}

	@Override
	public org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, java.lang.Integer> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_AOI;
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiRecord> getMainKey() {
		return org.openforis.calc.persistence.jooq.Keys.AOI_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiRecord>>asList(org.openforis.calc.persistence.jooq.Keys.AOI_PKEY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, ?>>asList(org.openforis.calc.persistence.jooq.Keys.AOI__AOI_LEVEL_FKEY, org.openforis.calc.persistence.jooq.Keys.AOI__PARENT_AOI_FKEY);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.AoiTable as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.AoiTable(alias);
	}
}
