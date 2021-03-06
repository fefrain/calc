package org.openforis.calc.model;

// Generated Aug 8, 2012 5:42:26 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * StratumAreaId generated by hbm2java
 */
@Embeddable
public class StratumAreaId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer stratumId;
	private Double area;

	public StratumAreaId() {
	}

	public StratumAreaId(Integer stratumId, Double area) {
		this.stratumId = stratumId;
		this.area = area;
	}

	@Column(name = "stratum_id")
	public Integer getStratumId() {
		return this.stratumId;
	}

	public void setStratumId(Integer stratumId) {
		this.stratumId = stratumId;
	}

	@Column(name = "area", precision = 17, scale = 17)
	public Double getArea() {
		return this.area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	@Override
	public boolean equals(Object other) {
		if ( this == other ) {
			return true;
		}
		if ( other == null ) {
			return false;
		}
		if ( !(other instanceof StratumAreaId) ) {
			return false;
		}
		final StratumAreaId castOther = (StratumAreaId) other;

		return (this.getStratumId() == castOther.getStratumId() || this.getStratumId() != null && castOther.getStratumId() != null && this.getStratumId().equals(castOther.getStratumId()))
				&& (this.getArea() == castOther.getArea() || this.getArea() != null && castOther.getArea() != null && this.getArea().equals(castOther.getArea()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getStratumId() == null ? 0 : this.getStratumId().hashCode());
		result = 37 * result + (getArea() == null ? 0 : this.getArea().hashCode());
		return result;
	}

}
