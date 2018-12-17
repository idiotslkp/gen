package com.massestech.common.gen.conf.fieldtype;

import com.massestech.common.gen.conf.Conf;
import com.massestech.common.gen.conf.ParseNode;
import com.massestech.common.gen.model.FieldType;
import org.dom4j.Element;

import java.util.Iterator;

public class ParseFieldType implements ParseNode {

    @Override
    public void parseNode(Element element, Conf conf) {
        // 获取mybatis配置相关信息元素迭代器
        Iterator<Element> it = element.elementIterator("FieldType");
        while (it.hasNext()) {
            Element fieldTypesEle = (Element) it.next();
            FieldType fieldType = new FieldType();
            // 数据库类型
            String sqlFieldType = fieldTypesEle.elementText("sqlFieldType").toLowerCase();
            fieldType.setSqlFieldType(sqlFieldType);
            // model字段类型
            fieldType.setModelFieldType(fieldTypesEle.elementText("modelFieldType"));
            // mybatis类型
            fieldType.setMybatisFieldType(fieldTypesEle.elementText("mybatisFieldType"));
            String importClass = fieldTypesEle.elementText("importClass");
            if (!"".equals(importClass)) {
                // 该字段对应的model可能需要导入的类
                fieldType.setImportClass(fieldTypesEle.elementText("importClass"));
            }
            fieldType.setDefaultValue(fieldTypesEle.elementText("defaultValue"));
            fieldType.setLength(fieldTypesEle.elementText("length"));
            // 存放到集合中去
            conf.addFieldType(fieldType);
        }
    }

}
