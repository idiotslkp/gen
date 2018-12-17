package com.massestech.common.gen.conf;

import com.massestech.common.gen.conf.datasource.ParseDataSource;
import com.massestech.common.gen.conf.fieldtype.ParseFieldType;
import com.massestech.common.gen.conf.parammap.ParseParamMap;
import com.massestech.common.gen.conf.tpl.ParseTpl;
import com.massestech.common.gen.util.TemplateUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ParseConf implements ParseNode {

    private static final Map<String, ParseNode> nodeMap = new HashMap<String, ParseNode>() {
        {
            put("paramMap", new ParseParamMap());
            put("tpls", new ParseTpl());
            put("dataSources", new ParseDataSource());
            put("FieldTypes", new ParseFieldType());
        }
    };

    /**
     * 解析conf节点
     *
     * @param confElement
     * @param conf
     */
    public void parseNode(Element confElement, Conf conf) {
        Set<String> nodeNames = nodeMap.keySet();
        for (String nodeName : nodeNames) {
            Element nodeElement = confElement.element(nodeName);
            ParseNode parseNode = nodeMap.get(nodeName);
            parseNode.parseNode(nodeElement, conf);
        }
    }

}
