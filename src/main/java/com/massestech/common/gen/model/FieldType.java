package com.massestech.common.gen.model;

import com.massestech.common.gen.conf.Conf;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 用于处理mybatis与model以及数据库之间字段类型的类
 *
 * @author LKP
 * @version 1.0
 * @copyright 锋锐科技 Copyright (c) 2016
 * @since 2016-2-1
 */
public class FieldType {
    /**
     * 数据库类型
     */
    private String sqlFieldType;
    /**
     * 字段类型
     */
    private String modelFieldType;
    /**
     * mybatis类型
     */
    private String mybatisFieldType;
    /**
     * 默认长度
     */
    private String length;
    /**
     * 需要导入的类
     */
    private String importClass;
    /**
     * 默认值
     */
    private String defaultValue;

    public FieldType() {
        super();
    }

    /**
     * @param sqlFieldType     数据库类型
     * @param modelFieldType   字段类型
     * @param mybatisFieldType mybatis类型
     * @param importClass      需要导入的类
     */
    public FieldType(String sqlFieldType, String modelFieldType,
                     String mybatisFieldType, String importClass) {
        super();
        this.sqlFieldType = sqlFieldType;
        this.modelFieldType = modelFieldType;
        this.mybatisFieldType = mybatisFieldType;
        this.importClass = importClass;
    }

    /**
     * 从map中获取到对应的字段类型model
     *
     * @param conf
     * @param sqlFieldType
     * @return
     */
    public static FieldType getFieldTypeBySqlFieldType(Conf conf, String sqlFieldType) {
        sqlFieldType = sqlFieldType.toLowerCase();
        List<FieldType> fieldTypeList = conf.getFieldTypeList();
        for (FieldType fieldType : fieldTypeList) {
            if (sqlFieldType.contains(fieldType.getSqlFieldType())) {
                return fieldType;
            }
        }
        throw new RuntimeException("\n很不好意思,报错了呢.....因为目前的配置暂时不支持" + sqlFieldType + "请到conf.xml里面去配置对应的类型"
                + "\n" + "具体位置:--><c:FieldTypes>标签节点");
    }

    public static FieldType getFieldTypeByModelFieldType(Conf conf, String modelFieldType) {
        List<FieldType> fieldTypeList = conf.getFieldTypeList();
        for (FieldType fieldType : fieldTypeList) {
            if (modelFieldType.equals(fieldType.getModelFieldType())) {
                return fieldType;
            }
        }
        throw new RuntimeException("\n很不好意思,报错了呢.....因为目前的配置暂时不支持" + modelFieldType + "请到conf.xml里面去配置对应的类型"
                + "\n" + "具体位置:--><c:FieldTypes>标签节点");
    }

    public String getSqlFieldType() {
        return sqlFieldType;
    }

    public void setSqlFieldType(String sqlFieldType) {
        this.sqlFieldType = sqlFieldType;
    }

    public String getModelFieldType() {
        return modelFieldType;
    }

    public void setModelFieldType(String modelFieldType) {
        this.modelFieldType = modelFieldType;
    }

    public String getMybatisFieldType() {
        return mybatisFieldType;
    }

    public void setMybatisFieldType(String mybatisFieldType) {
        this.mybatisFieldType = mybatisFieldType;
    }

    public String getImportClass() {
        return importClass;
    }

    public void setImportClass(String importClass) {
        this.importClass = importClass;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}
