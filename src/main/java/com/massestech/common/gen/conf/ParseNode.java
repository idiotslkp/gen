package com.massestech.common.gen.conf;

import org.dom4j.Element;

/**
 * 解析节点
 */
public interface ParseNode {

    void parseNode(Element element, Conf conf);

}
