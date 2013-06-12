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
public class VariableRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.VariableRecord> {

	private static final long serialVersionUID = 1544675508;

	/**
	 * The table column <code>calc.variable.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ID, value);
	}

	/**
	 * The table column <code>calc.variable.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ID);
	}

	/**
	 * The table column <code>calc.variable.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord> fetchCategoryTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY)
			.where(org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY.VARIABLE_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.variable.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.HierarchyRecord> fetchHierarchyTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.HierarchyTable.HIERARCHY)
			.where(org.openforis.calc.persistence.jooq.tables.HierarchyTable.HIERARCHY.VARIABLE_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.variable.entity_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_entity_fkey
	 * FOREIGN KEY (entity_id)
	 * REFERENCES calc.entity (id)
	 * </pre></code>
	 */
	public void setEntityId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ENTITY_ID, value);
	}

	/**
	 * The table column <code>calc.variable.entity_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_entity_fkey
	 * FOREIGN KEY (entity_id)
	 * REFERENCES calc.entity (id)
	 * </pre></code>
	 */
	public java.lang.Integer getEntityId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ENTITY_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.EntityRecord 
	 * EntityRecord}
	 */
	public void setEntityId(org.openforis.calc.persistence.jooq.tables.records.EntityRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ENTITY_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ENTITY_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY.ID));
		}
	}

	/**
	 * The table column <code>calc.variable.entity_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_entity_fkey
	 * FOREIGN KEY (entity_id)
	 * REFERENCES calc.entity (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.EntityRecord fetchEntityTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY)
			.where(org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ENTITY_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.variable.value_column_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__FKvariable342421
	 * FOREIGN KEY (value_column_id)
	 * REFERENCES calc.dbcolumn (id)
	 * </pre></code>
	 */
	public void setValueColumnId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.VALUE_COLUMN_ID, value);
	}

	/**
	 * The table column <code>calc.variable.value_column_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__FKvariable342421
	 * FOREIGN KEY (value_column_id)
	 * REFERENCES calc.dbcolumn (id)
	 * </pre></code>
	 */
	public java.lang.Integer getValueColumnId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.VALUE_COLUMN_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.DbcolumnRecord 
	 * DbcolumnRecord}
	 */
	public void setValueColumnId(org.openforis.calc.persistence.jooq.tables.records.DbcolumnRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.VALUE_COLUMN_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.VALUE_COLUMN_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.DbcolumnTable.DBCOLUMN.ID));
		}
	}

	/**
	 * The table column <code>calc.variable.value_column_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__FKvariable342421
	 * FOREIGN KEY (value_column_id)
	 * REFERENCES calc.dbcolumn (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.DbcolumnRecord fetchDbcolumnTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.DbcolumnTable.DBCOLUMN)
			.where(org.openforis.calc.persistence.jooq.tables.DbcolumnTable.DBCOLUMN.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.VALUE_COLUMN_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.variable.code_list_table_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_code_list_table_fkey
	 * FOREIGN KEY (code_list_table_id)
	 * REFERENCES calc.dbtable (id)
	 * </pre></code>
	 */
	public void setCodeListTableId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.CODE_LIST_TABLE_ID, value);
	}

	/**
	 * The table column <code>calc.variable.code_list_table_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_code_list_table_fkey
	 * FOREIGN KEY (code_list_table_id)
	 * REFERENCES calc.dbtable (id)
	 * </pre></code>
	 */
	public java.lang.Integer getCodeListTableId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.CODE_LIST_TABLE_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.DbtableRecord 
	 * DbtableRecord}
	 */
	public void setCodeListTableId(org.openforis.calc.persistence.jooq.tables.records.DbtableRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.CODE_LIST_TABLE_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.CODE_LIST_TABLE_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.ID));
		}
	}

	/**
	 * The table column <code>calc.variable.code_list_table_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_code_list_table_fkey
	 * FOREIGN KEY (code_list_table_id)
	 * REFERENCES calc.dbtable (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.DbtableRecord fetchDbtableTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE)
			.where(org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.CODE_LIST_TABLE_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.variable.default_category_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_default_category_fkey
	 * FOREIGN KEY (default_category_id)
	 * REFERENCES calc.category (id)
	 * </pre></code>
	 */
	public void setDefaultCategoryId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.DEFAULT_CATEGORY_ID, value);
	}

	/**
	 * The table column <code>calc.variable.default_category_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_default_category_fkey
	 * FOREIGN KEY (default_category_id)
	 * REFERENCES calc.category (id)
	 * </pre></code>
	 */
	public java.lang.Integer getDefaultCategoryId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.DEFAULT_CATEGORY_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.CategoryRecord 
	 * CategoryRecord}
	 */
	public void setDefaultCategoryId(org.openforis.calc.persistence.jooq.tables.records.CategoryRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.DEFAULT_CATEGORY_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.DEFAULT_CATEGORY_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY.ID));
		}
	}

	/**
	 * The table column <code>calc.variable.default_category_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_default_category_fkey
	 * FOREIGN KEY (default_category_id)
	 * REFERENCES calc.category (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.CategoryRecord fetchCategoryTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY)
			.where(org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.DEFAULT_CATEGORY_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.variable.scale</code>
	 */
	public void setScale(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.SCALE, value);
	}

	/**
	 * The table column <code>calc.variable.scale</code>
	 */
	public java.lang.String getScale() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.SCALE);
	}

	/**
	 * The table column <code>calc.variable.name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.NAME, value);
	}

	/**
	 * The table column <code>calc.variable.name</code>
	 */
	public java.lang.String getName() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.NAME);
	}

	/**
	 * The table column <code>calc.variable.caption</code>
	 */
	public void setCaption(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.CAPTION, value);
	}

	/**
	 * The table column <code>calc.variable.caption</code>
	 */
	public java.lang.String getCaption() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.CAPTION);
	}

	/**
	 * The table column <code>calc.variable.description</code>
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.DESCRIPTION, value);
	}

	/**
	 * The table column <code>calc.variable.description</code>
	 */
	public java.lang.String getDescription() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.DESCRIPTION);
	}

	/**
	 * The table column <code>calc.variable.default_value</code>
	 */
	public void setDefaultValue(java.lang.Double value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.DEFAULT_VALUE, value);
	}

	/**
	 * The table column <code>calc.variable.default_value</code>
	 */
	public java.lang.Double getDefaultValue() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.DEFAULT_VALUE);
	}

	/**
	 * The table column <code>calc.variable.cube_member</code>
	 */
	public void setCubeMember(java.lang.Boolean value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.CUBE_MEMBER, value);
	}

	/**
	 * The table column <code>calc.variable.cube_member</code>
	 */
	public java.lang.Boolean getCubeMember() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.CUBE_MEMBER);
	}

	/**
	 * The table column <code>calc.variable.sort_order</code>
	 */
	public void setSortOrder(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.SORT_ORDER, value);
	}

	/**
	 * The table column <code>calc.variable.sort_order</code>
	 */
	public java.lang.Integer getSortOrder() {
		return getValue(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.SORT_ORDER);
	}

	/**
	 * Create a detached VariableRecord
	 */
	public VariableRecord() {
		super(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE);
	}
}
