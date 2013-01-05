package org.openforis.calc.model;


/**
 * @author G. Miceli
 */
public class PlotCategory extends org.openforis.calc.persistence.jooq.tables.pojos.PlotCategory implements ModelObject {

	private static final long serialVersionUID = 1L;

	public PlotCategory() {
	}
	
	public PlotCategory(PlotSurvey plot, Category cat, boolean computed) {
		setPlotSurveyId(plot.getId());
		setCategoryId(cat.getId());
		setComputed(computed);
	}
}
