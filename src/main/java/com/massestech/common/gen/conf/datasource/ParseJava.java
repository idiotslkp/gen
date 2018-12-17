package com.massestech.common.gen.conf.datasource;

import com.massestech.common.gen.conf.Conf;
import com.massestech.common.gen.conf.ParseNode;
import com.massestech.common.gen.model.Column;
import com.massestech.common.gen.model.FieldType;
import com.massestech.common.gen.model.Table;
import org.dom4j.Element;

import javax.persistence.Comment;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 解析java文件的文件,该java文件必须使用jpa那种注释方式
 */
public class ParseJava implements ParseNode {

    public static Class clazz;

    @Override
    public void parseNode(Element element, Conf conf) {
        Table table = new Table();
        javax.persistence.Table tableAnno = (javax.persistence.Table) clazz.getAnnotation(javax.persistence.Table.class);
        Comment commentAnno = (Comment) clazz.getAnnotation(Comment.class);
        if (tableAnno != null) {
            table.setTableName(tableAnno.name());
            table.setModelName(clazz.getSimpleName());
            table.setComment(commentAnno.value());  // 设置表格注释
            // 设置字段
            setColumn(clazz, table, conf);
        } else {
            exit("缺少Table注解");
        }
        conf.addTabel(table);
    }

    private void setColumn(Class clazz, Table table, Conf conf) {
        List<Column> columnList = new ArrayList<>();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            javax.persistence.Column columnAnno = field.getAnnotation(javax.persistence.Column.class);
            com.massestech.common.gen.conf.datasource.model.Column column = new com.massestech.common.gen.conf.datasource.model.Column();
            column.setName(field.getName());
            // 这里会判断一下是否有给定字段名称,如果没有的话就拿字段,接着驼峰转下划线作为数据库名称
            if ("".equals(columnAnno.name())) {
                column.setSqlName(humpToLine2(field.getName()));    // 驼峰转下划线
            } else {
                column.setSqlName(columnAnno.name());
            }
            column.setFileType(field.getType().getSimpleName());
            column.setComment(columnAnno.columnDefinition());
            String sqlType;
            FieldType fieldType = FieldType.getFieldTypeByModelFieldType(conf, field.getType().getSimpleName());
            // 日期做一下特殊处理
            if ("Date".equals(field.getType().getSimpleName())) {
                sqlType = fieldType.getSqlFieldType();
            } else {
                // 如果有规定长度,那么就使用规定的,否则使用默认的.
                String length = columnAnno.length() == 255 ? fieldType.getLength() : String.valueOf(columnAnno.length());
                sqlType = fieldType.getSqlFieldType() + "(" + length + ")";
            }

            if (null != fieldType.getImportClass()) {
                table.addImportClass(fieldType.getImportClass());
            }

            column.setType(sqlType);
            column.setDeafultValue(fieldType.getDefaultValue()); // 默认值.
            columnList.add(column);
        }
        table.setColumnList(columnList);
    }

    /**
     * 新增model
     */
    public static void addModel(Class clazz) {
        ParseJava.clazz = clazz;
    }

    private void exit(String msg) {
        System.out.println(msg);
        System.exit(0);
    }

    private static Pattern humpPattern = Pattern.compile("[A-Z]");

    /**
     * 驼峰转下划线
     */
    public static String humpToLine2(String str) {
        Matcher matcher = humpPattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

}
