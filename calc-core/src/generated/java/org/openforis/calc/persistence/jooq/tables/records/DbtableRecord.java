/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class DbtableRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord> {

	private static final long serialVersionUID = -579631179;

	/**
	 * The table column <code>calc.dbtable.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.ID, value);
	}

	/**
	 * The table column <code>calc.dbtable.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.ID);
	}

	/**
	 * The table column <code>calc.dbtable.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.DbcolumnRecord> fetchDbcolumnTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.DbcolumnTable.DBCOLUMN)
			.where(org.openforis.calc.persistence.jooq.tables.DbcolumnTable.DBCOLUMN.TABLE_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.dbtable.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.EntityRecord> fetchEntityTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY)
			.where(org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY.DATA_TABLE_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.dbtable.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.VariableRecord> fetchVariableTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE)
			.where(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.CODE_LIST_TABLE_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.dbtable.workspace_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT dbtable__FKdbtable788482
	 * FOREIGN KEY (workspace_id)
	 * REFERENCES calc.workspace (id)
	 * </pre></code>
	 */
	public void setWorkspaceId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.WORKSPACE_ID, value);
	}

	/**
	 * The table column <code>calc.dbtable.workspace_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT dbtable__FKdbtable788482
	 * FOREIGN KEY (workspace_id)
	 * REFERENCES calc.workspace (id)
	 * </pre></code>
	 */
	public java.lang.Integer getWorkspaceId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.WORKSPACE_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord 
	 * WorkspaceRecord}
	 */
	public void setWorkspaceId(org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.WORKSPACE_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.WORKSPACE_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.WorkspaceTable.WORKSPACE.ID));
		}
	}

	/**
	 * The table column <code>calc.dbtable.workspace_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT dbtable__FKdbtable788482
	 * FOREIGN KEY (workspace_id)
	 * REFERENCES calc.workspace (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord fetchWorkspaceTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.WorkspaceTable.WORKSPACE)
			.where(org.openforis.calc.persistence.jooq.tables.WorkspaceTable.WORKSPACE.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.WORKSPACE_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.dbtable.name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.NAME, value);
	}

	/**
	 * The table column <code>calc.dbtable.name</code>
	 */
	public java.lang.String getName() {
		return getValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.NAME);
	}

	/**
	 * The table column <code>calc.dbtable.type</code>
	 */
	public void setType(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.TYPE, value);
	}

	/**
	 * The table column <code>calc.dbtable.type</code>
	 */
	public java.lang.String getType() {
		return getValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.TYPE);
	}

	/**
	 * The table column <code>calc.dbtable.input_table</code>
	 */
	public void setInputTable(java.lang.Boolean value) {
		setValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.INPUT_TABLE, value);
	}

	/**
	 * The table column <code>calc.dbtable.input_table</code>
	 */
	public java.lang.Boolean getInputTable() {
		return getValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.INPUT_TABLE);
	}

	/**
	 * Create a detached DbtableRecord
	 */
	public DbtableRecord() {
		super(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE);
	}
}
