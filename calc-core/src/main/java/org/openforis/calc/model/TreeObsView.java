package org.openforis.calc.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TreeObsView generated by hbm2java
 */
@Entity
@Table(name = "tree_obs_view")
public class TreeObsView implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer plotObsId;
	private Integer taxonId;
	private Integer healthId;
	private Integer originId;
	private BigDecimal dbh;
	private BigDecimal dbhHeight;
	private BigDecimal topHeight;
	private BigDecimal boleHeight;
	private BigDecimal stumpDiameter;
	private BigDecimal stumpHeight;
	private BigDecimal inclusionArea;
	private Double inclusionProbability;
	private BigDecimal estTopHeight;
	private BigDecimal estBasalArea;
	private BigDecimal estStemVolume;
	private BigDecimal estBoleVolume;
	private BigDecimal estTopVolume;
	private BigDecimal estVolume;
	private BigDecimal estStemBiomass;
	private BigDecimal estAgBiomass;
	private BigDecimal estBgBiomass;
	private BigDecimal estBiomass;
	private BigDecimal estStemCarbon;
	private BigDecimal estAgCarbon;
	private BigDecimal estBgCarbon;
	private BigDecimal estCarbon;
	private Integer plotId;
	private String plotCode;
	private String plotSection;
	private Integer clusterId;
	private String clusterCode;
	private Integer stratumId;
	private String stratumCode;
	private Integer adminUnitId;

	public TreeObsView() {
	}

	public TreeObsView(Integer id, Integer plotObsId, Integer taxonId, Integer healthId, Integer originId, BigDecimal dbh, BigDecimal dbhHeight, BigDecimal topHeight, BigDecimal boleHeight,
			BigDecimal stumpDiameter, BigDecimal stumpHeight, BigDecimal inclusionArea, Double inclusionProbability, BigDecimal estTopHeight, BigDecimal estBasalArea, BigDecimal estStemVolume,
			BigDecimal estBoleVolume, BigDecimal estTopVolume, BigDecimal estVolume, BigDecimal estStemBiomass, BigDecimal estAgBiomass, BigDecimal estBgBiomass, BigDecimal estBiomass,
			BigDecimal estStemCarbon, BigDecimal estAgCarbon, BigDecimal estBgCarbon, BigDecimal estCarbon, Integer plotId, String plotCode, String plotSection, Integer clusterId, String clusterCode,
			Integer stratumId, String stratumCode, Integer adminUnitId) {
		this.id = id;
		this.plotObsId = plotObsId;
		this.taxonId = taxonId;
		this.healthId = healthId;
		this.originId = originId;
		this.dbh = dbh;
		this.dbhHeight = dbhHeight;
		this.topHeight = topHeight;
		this.boleHeight = boleHeight;
		this.stumpDiameter = stumpDiameter;
		this.stumpHeight = stumpHeight;
		this.inclusionArea = inclusionArea;
		this.inclusionProbability = inclusionProbability;
		this.estTopHeight = estTopHeight;
		this.estBasalArea = estBasalArea;
		this.estStemVolume = estStemVolume;
		this.estBoleVolume = estBoleVolume;
		this.estTopVolume = estTopVolume;
		this.estVolume = estVolume;
		this.estStemBiomass = estStemBiomass;
		this.estAgBiomass = estAgBiomass;
		this.estBgBiomass = estBgBiomass;
		this.estBiomass = estBiomass;
		this.estStemCarbon = estStemCarbon;
		this.estAgCarbon = estAgCarbon;
		this.estBgCarbon = estBgCarbon;
		this.estCarbon = estCarbon;
		this.plotId = plotId;
		this.plotCode = plotCode;
		this.plotSection = plotSection;
		this.clusterId = clusterId;
		this.clusterCode = clusterCode;
		this.stratumId = stratumId;
		this.stratumCode = stratumCode;
		this.adminUnitId = adminUnitId;
	}

	@Id
	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "plot_obs_id")
	public Integer getPlotObsId() {
		return this.plotObsId;
	}

	public void setPlotObsId(Integer plotObsId) {
		this.plotObsId = plotObsId;
	}

	@Column(name = "taxon_id")
	public Integer getTaxonId() {
		return this.taxonId;
	}

	public void setTaxonId(Integer taxonId) {
		this.taxonId = taxonId;
	}

	@Column(name = "health_id")
	public Integer getHealthId() {
		return this.healthId;
	}

	public void setHealthId(Integer healthId) {
		this.healthId = healthId;
	}

	@Column(name = "origin_id")
	public Integer getOriginId() {
		return this.originId;
	}

	public void setOriginId(Integer originId) {
		this.originId = originId;
	}

	@Column(name = "dbh", precision = 15, scale = 5)
	public BigDecimal getDbh() {
		return this.dbh;
	}

	public void setDbh(BigDecimal dbh) {
		this.dbh = dbh;
	}

	@Column(name = "dbh_height", precision = 15, scale = 5)
	public BigDecimal getDbhHeight() {
		return this.dbhHeight;
	}

	public void setDbhHeight(BigDecimal dbhHeight) {
		this.dbhHeight = dbhHeight;
	}

	@Column(name = "top_height", precision = 15, scale = 5)
	public BigDecimal getTopHeight() {
		return this.topHeight;
	}

	public void setTopHeight(BigDecimal topHeight) {
		this.topHeight = topHeight;
	}

	@Column(name = "bole_height", precision = 15, scale = 5)
	public BigDecimal getBoleHeight() {
		return this.boleHeight;
	}

	public void setBoleHeight(BigDecimal boleHeight) {
		this.boleHeight = boleHeight;
	}

	@Column(name = "stump_diameter", precision = 15, scale = 5)
	public BigDecimal getStumpDiameter() {
		return this.stumpDiameter;
	}

	public void setStumpDiameter(BigDecimal stumpDiameter) {
		this.stumpDiameter = stumpDiameter;
	}

	@Column(name = "stump_height", precision = 15, scale = 5)
	public BigDecimal getStumpHeight() {
		return this.stumpHeight;
	}

	public void setStumpHeight(BigDecimal stumpHeight) {
		this.stumpHeight = stumpHeight;
	}

	@Column(name = "inclusion_area", precision = 15, scale = 5)
	public BigDecimal getInclusionArea() {
		return this.inclusionArea;
	}

	public void setInclusionArea(BigDecimal inclusionArea) {
		this.inclusionArea = inclusionArea;
	}

	@Column(name = "inclusion_probability", precision = 17, scale = 17)
	public Double getInclusionProbability() {
		return this.inclusionProbability;
	}

	public void setInclusionProbability(Double inclusionProbability) {
		this.inclusionProbability = inclusionProbability;
	}

	@Column(name = "est_top_height", precision = 15, scale = 5)
	public BigDecimal getEstTopHeight() {
		return this.estTopHeight;
	}

	public void setEstTopHeight(BigDecimal estTopHeight) {
		this.estTopHeight = estTopHeight;
	}

	@Column(name = "est_basal_area", precision = 15, scale = 5)
	public BigDecimal getEstBasalArea() {
		return this.estBasalArea;
	}

	public void setEstBasalArea(BigDecimal estBasalArea) {
		this.estBasalArea = estBasalArea;
	}

	@Column(name = "est_stem_volume", precision = 15, scale = 5)
	public BigDecimal getEstStemVolume() {
		return this.estStemVolume;
	}

	public void setEstStemVolume(BigDecimal estStemVolume) {
		this.estStemVolume = estStemVolume;
	}

	@Column(name = "est_bole_volume", precision = 15, scale = 5)
	public BigDecimal getEstBoleVolume() {
		return this.estBoleVolume;
	}

	public void setEstBoleVolume(BigDecimal estBoleVolume) {
		this.estBoleVolume = estBoleVolume;
	}

	@Column(name = "est_top_volume", precision = 15, scale = 5)
	public BigDecimal getEstTopVolume() {
		return this.estTopVolume;
	}

	public void setEstTopVolume(BigDecimal estTopVolume) {
		this.estTopVolume = estTopVolume;
	}

	@Column(name = "est_volume", precision = 15, scale = 5)
	public BigDecimal getEstVolume() {
		return this.estVolume;
	}

	public void setEstVolume(BigDecimal estVolume) {
		this.estVolume = estVolume;
	}

	@Column(name = "est_stem_biomass", precision = 15, scale = 5)
	public BigDecimal getEstStemBiomass() {
		return this.estStemBiomass;
	}

	public void setEstStemBiomass(BigDecimal estStemBiomass) {
		this.estStemBiomass = estStemBiomass;
	}

	@Column(name = "est_ag_biomass", precision = 15, scale = 5)
	public BigDecimal getEstAgBiomass() {
		return this.estAgBiomass;
	}

	public void setEstAgBiomass(BigDecimal estAgBiomass) {
		this.estAgBiomass = estAgBiomass;
	}

	@Column(name = "est_bg_biomass", precision = 15, scale = 5)
	public BigDecimal getEstBgBiomass() {
		return this.estBgBiomass;
	}

	public void setEstBgBiomass(BigDecimal estBgBiomass) {
		this.estBgBiomass = estBgBiomass;
	}

	@Column(name = "est_biomass", precision = 15, scale = 5)
	public BigDecimal getEstBiomass() {
		return this.estBiomass;
	}

	public void setEstBiomass(BigDecimal estBiomass) {
		this.estBiomass = estBiomass;
	}

	@Column(name = "est_stem_carbon", precision = 15, scale = 5)
	public BigDecimal getEstStemCarbon() {
		return this.estStemCarbon;
	}

	public void setEstStemCarbon(BigDecimal estStemCarbon) {
		this.estStemCarbon = estStemCarbon;
	}

	@Column(name = "est_ag_carbon", precision = 15, scale = 5)
	public BigDecimal getEstAgCarbon() {
		return this.estAgCarbon;
	}

	public void setEstAgCarbon(BigDecimal estAgCarbon) {
		this.estAgCarbon = estAgCarbon;
	}

	@Column(name = "est_bg_carbon", precision = 15, scale = 5)
	public BigDecimal getEstBgCarbon() {
		return this.estBgCarbon;
	}

	public void setEstBgCarbon(BigDecimal estBgCarbon) {
		this.estBgCarbon = estBgCarbon;
	}

	@Column(name = "est_carbon", precision = 15, scale = 5)
	public BigDecimal getEstCarbon() {
		return this.estCarbon;
	}

	public void setEstCarbon(BigDecimal estCarbon) {
		this.estCarbon = estCarbon;
	}

	@Column(name = "plot_id")
	public Integer getPlotId() {
		return this.plotId;
	}

	public void setPlotId(Integer plotId) {
		this.plotId = plotId;
	}

	@Column(name = "plot_code", length = 25)
	public String getPlotCode() {
		return this.plotCode;
	}

	public void setPlotCode(String plotCode) {
		this.plotCode = plotCode;
	}

	@Column(name = "plot_section", length = 25)
	public String getPlotSection() {
		return this.plotSection;
	}

	public void setPlotSection(String plotSection) {
		this.plotSection = plotSection;
	}

	@Column(name = "cluster_id")
	public Integer getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}

	@Column(name = "cluster_code", length = 25)
	public String getClusterCode() {
		return this.clusterCode;
	}

	public void setClusterCode(String clusterCode) {
		this.clusterCode = clusterCode;
	}

	@Column(name = "stratum_id")
	public Integer getStratumId() {
		return this.stratumId;
	}

	public void setStratumId(Integer stratumId) {
		this.stratumId = stratumId;
	}

	@Column(name = "stratum_code", length = 25)
	public String getStratumCode() {
		return this.stratumCode;
	}

	public void setStratumCode(String stratumCode) {
		this.stratumCode = stratumCode;
	}

	@Column(name = "admin_unit_id")
	public Integer getAdminUnitId() {
		return this.adminUnitId;
	}

	public void setAdminUnitId(Integer adminUnitId) {
		this.adminUnitId = adminUnitId;
	}

	@Override
	public boolean equals(Object other) {
		if ( this == other ) {
			return true;
		}
		if ( other == null ) {
			return false;
		}
		if ( !(other instanceof TreeObsView) ) {
			return false;
		}
		final TreeObsView castOther = (TreeObsView) other;

		return this.getId() == castOther.getId() || this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId());
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}
