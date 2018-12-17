package com.massestech.common.gen.conf.datasource;

import com.massestech.common.gen.conf.Conf;
import com.massestech.common.gen.conf.ParseNode;
import com.massestech.common.gen.conf.parammap.ParseParamMap;
import com.massestech.common.gen.conf.tpl.ParseTpl;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.Map;

public class ParseDataSource implements DataSourceNode, ParseNode {

    private static final Map<Integer, ParseNode> nodeMap = new HashMap<Integer, ParseNode>() {
        {
            put(1, new ParseJava());
            put(2, new ParseDb());
            put(3, new ParsePdm());
        }
    };

    @Override
    public void parseNode(Element element, Conf conf) {
        ParseNode parseNode = nodeMap.get(conf.getParseType());
        parseNode.parseNode(element, conf);
    }

}
