package com.massestech.common.gen.model;

/**
 * 获取数据库字段model
 *
 * @author LKP
 * @version 1.0
 * @copyright 锋锐科技 Copyright (c) 2015
 * @since 2015-9-25
 */
public class Column {
    /**
     * model属性名
     */
    private String name;
    /**
     * sql字段名
     */
    private String sqlName;
    /**
     * 数据库字段类型
     */
    private String type;
    /**
     * 注释
     */
    private String comment;
    /**
     * 字段类型
     */
    private String fileType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSqlName() {
        return sqlName;
    }

    public void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

}
