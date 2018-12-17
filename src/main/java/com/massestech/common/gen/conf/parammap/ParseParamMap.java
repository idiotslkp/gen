package com.massestech.common.gen.conf.parammap;

import com.massestech.common.gen.conf.Conf;
import com.massestech.common.gen.conf.ParseNode;
import com.massestech.common.gen.util.FileUtil;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParseParamMap implements ParseNode {

    private static final String TPL_DIR = "tplsPackageUrl";

    /**
     * 解析paramMap节点
     *
     * @author LKP
     * @Date 2017-1-13
     */
    public void parseNode(Element element, Conf conf) {
        Iterator<Element> elementIterator = element.elementIterator();
        while (elementIterator.hasNext()) {
            Element mapElement = elementIterator.next();
            String key = mapElement.getName();
            String value = mapElement.getText();
            conf.addParamMap(key, value);
        }
        conf.initConfiguration(FileUtil.getFileByFilePath(conf.getParamMap().get(TPL_DIR)));
    }
}
