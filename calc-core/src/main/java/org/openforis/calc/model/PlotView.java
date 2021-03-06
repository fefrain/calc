package org.openforis.calc.model;

// Generated Aug 8, 2012 5:42:26 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PlotView generated by hbm2java
 */
@Entity
@Table(name = "plot_view")
public class PlotView implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PlotViewId id;

	public PlotView() {
	}

	public PlotView(PlotViewId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id")), @AttributeOverride(name = "code", column = @Column(name = "code", length = 25)),
			@AttributeOverride(name = "label", column = @Column(name = "label")), @AttributeOverride(name = "clusterId", column = @Column(name = "cluster_id")),
			@AttributeOverride(name = "location", column = @Column(name = "location")), @AttributeOverride(name = "phase", column = @Column(name = "phase")),
			@AttributeOverride(name = "clusterCode", column = @Column(name = "cluster_code", length = 25)), @AttributeOverride(name = "adminUnitId", column = @Column(name = "admin_unit_id")),
			@AttributeOverride(name = "stratumId", column = @Column(name = "stratum_id")), @AttributeOverride(name = "stratumCode", column = @Column(name = "stratum_code", length = 25)) })
	public PlotViewId getId() {
		return this.id;
	}

	public void setId(PlotViewId id) {
		this.id = id;
	}

}
