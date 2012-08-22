package org.openforis.calc.model;

// Generated Aug 8, 2012 5:42:26 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * StratumAreaDistId generated by hbm2java
 */
@Embeddable
public class StratumAreaDistId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer stratumId;
	private Integer class1Id;
	private Integer class2Id;
	private Double estArea;
	private Double proportion;

	public StratumAreaDistId() {
	}

	public StratumAreaDistId(Integer stratumId, Integer class1Id, Integer class2Id, Double estArea, Double proportion) {
		this.stratumId = stratumId;
		this.class1Id = class1Id;
		this.class2Id = class2Id;
		this.estArea = estArea;
		this.proportion = proportion;
	}

	@Column(name = "stratum_id")
	public Integer getStratumId() {
		return this.stratumId;
	}

	public void setStratumId(Integer stratumId) {
		this.stratumId = stratumId;
	}

	@Column(name = "class1_id")
	public Integer getClass1Id() {
		return this.class1Id;
	}

	public void setClass1Id(Integer class1Id) {
		this.class1Id = class1Id;
	}

	@Column(name = "class2_id")
	public Integer getClass2Id() {
		return this.class2Id;
	}

	public void setClass2Id(Integer class2Id) {
		this.class2Id = class2Id;
	}

	@Column(name = "est_area", precision = 17, scale = 17)
	public Double getEstArea() {
		return this.estArea;
	}

	public void setEstArea(Double estArea) {
		this.estArea = estArea;
	}

	@Column(name = "proportion", precision = 17, scale = 17)
	public Double getProportion() {
		return this.proportion;
	}

	public void setProportion(Double proportion) {
		this.proportion = proportion;
	}

	@Override
	public boolean equals(Object other) {
		if ( this == other ) {
			return true;
		}
		if ( other == null ) {
			return false;
		}
		if ( !(other instanceof StratumAreaDistId) ) {
			return false;
		}
		final StratumAreaDistId castOther = (StratumAreaDistId) other;

		return (this.getStratumId() == castOther.getStratumId() || this.getStratumId() != null && castOther.getStratumId() != null && this.getStratumId().equals(castOther.getStratumId()))
				&& (this.getClass1Id() == castOther.getClass1Id() || this.getClass1Id() != null && castOther.getClass1Id() != null && this.getClass1Id().equals(castOther.getClass1Id()))
				&& (this.getClass2Id() == castOther.getClass2Id() || this.getClass2Id() != null && castOther.getClass2Id() != null && this.getClass2Id().equals(castOther.getClass2Id()))
				&& (this.getEstArea() == castOther.getEstArea() || this.getEstArea() != null && castOther.getEstArea() != null && this.getEstArea().equals(castOther.getEstArea()))
				&& (this.getProportion() == castOther.getProportion() || this.getProportion() != null && castOther.getProportion() != null && this.getProportion().equals(castOther.getProportion()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getStratumId() == null ? 0 : this.getStratumId().hashCode());
		result = 37 * result + (getClass1Id() == null ? 0 : this.getClass1Id().hashCode());
		result = 37 * result + (getClass2Id() == null ? 0 : this.getClass2Id().hashCode());
		result = 37 * result + (getEstArea() == null ? 0 : this.getEstArea().hashCode());
		result = 37 * result + (getProportion() == null ? 0 : this.getProportion().hashCode());
		return result;
	}

}
