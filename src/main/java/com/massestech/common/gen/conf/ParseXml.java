package com.massestech.common.gen.conf;

import com.massestech.common.gen.util.TemplateUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ParseXml implements ParseNode {

    @Override
    public void parseNode(Element element, Conf conf) {
        SAXReader reader = new SAXReader();
        // 加载配置文件
        InputStream in = TemplateUtil.class.getClassLoader().getResourceAsStream("conf.xml");

        if (null == in) {
            in = TemplateUtil.class.getClassLoader().getResourceAsStream("\\" + "conf.xml");
        }
        Document document = null;
        try {
            document = reader.read(in);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put("o", "object"); // 设置pdm的命名空间
        XPath path = document.createXPath("//o:conf"); // 定义获取c:Tables的内容
        path.setNamespaceURIs(map);
        // 获取到我们想要的节点元素,初始化
        Element confElement = (Element) path.selectSingleNode(document);
        conf.setConfElement(confElement);
    }

    public void parse(Conf conf) {
        this.parseNode(null, conf);
        ParseNode parseConf = new ParseConf();
        parseConf.parseNode(conf.getConfElement(), conf);
    }

}
