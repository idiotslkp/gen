package com.massestech.common.gen.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * pdm表信息
 *
 * @author LKP
 * @version 1.0
 * @copyright 锋锐科技 Copyright (c) 2016
 * @since 2016-5-27
 */
public class Table {
    /**
     * 生成的model的名称
     */
    private String modelName;
    /**
     * 对应的数据库的表名称
     */
    private String tableName;// 表名
    /**
     * 对应的表注释
     */
    private String comment;
    /**
     * 表对应的列属性信息集合
     */
    private List<Column> columnList;
    /**
     * 需要导入包的集合
     */
    private Set<String> importClassSet = new HashSet<>();
    /**
     * 需要导入包的集合
     */
    private List<String> importClassList;

    /**
     * 生成的model的名称
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * 生成的model的名称
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * 对应的数据库的表名称
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 对应的数据库的表名称
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * 对应的表注释
     */
    public String getComment() {
        return comment;
    }

    /**
     * 对应的表注释
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 表对应的列属性信息集合
     */
    public List<Column> getColumnList() {
        return columnList;
    }

    /**
     * 表对应的列属性信息集合
     */
    public void setColumnList(List<Column> columnList) {
        this.columnList = columnList;
    }

    /**
     * 需要导入包的集合
     */
    public Set<String> getImportClassSet() {
        return importClassSet;
    }

    /**
     * 需要导入包的集合
     */
    public void setImportClassSet(Set<String> importClassSet) {
        this.importClassSet = importClassSet;
    }

    public void addImportClass(String importClass) {
        importClassSet.add(importClass);
    }

    /**
     * 需要导入包的集合
     */
    public List<String> getImportClassList() {
        return new ArrayList<String>(this.importClassSet);
    }

    /**
     * 需要导入包的集合
     */
    public void setImportClassList(List<String> importClassList) {
        this.importClassList = importClassList;
    }

}
