package com.massestech.common.gen.conf.datasource;

import com.massestech.common.gen.conf.Conf;
import com.massestech.common.gen.conf.ParseNode;
import com.massestech.common.gen.model.Table;
import org.dom4j.Element;

/**
 * 解析数据库.数据库的形式只能一次生成一张表,因为表名跟model名称一般情况下都是不一样的.
 */
public class ParseDb implements ParseNode {

    @Override
    public void parseNode(Element element, Conf conf) {
        Table table = new Table();

        conf.addTabel(table);
    }

}
