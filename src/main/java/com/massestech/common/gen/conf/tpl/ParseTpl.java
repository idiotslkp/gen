package com.massestech.common.gen.conf.tpl;

import com.massestech.common.gen.conf.Conf;
import com.massestech.common.gen.conf.ParseNode;
import com.massestech.common.gen.conf.parammap.ParseParamMap;
import org.dom4j.Element;

import java.util.*;

/**
 * 模板信息类,存放了模板的信息
 *
 * @author LKP
 * @version 1.0
 * @copyright 广州明动软件有限公司 Copyright (c) 2016
 * @since 2016-6-18
 */
public class ParseTpl implements ParseNode {

    @Override
    public void parseNode(Element element, Conf conf) {
        // 迭代所有模板并将其设置到配置文件的容器
        Iterator<Element> tplElementIt = element.elementIterator("tpl");
        while (tplElementIt.hasNext()) {
            Element tplElement = tplElementIt.next();
            Tpl tpl = new Tpl(); // 定义模板类

            // 存放模板的名称
            tpl.setName(tplElement.elementText("name"));
            // 模板的前缀包名
            String suffix = tplElement.elementText("suffix");
            if (!"".equals(suffix)) {
                tpl.setSuffix(tplElement.elementText("suffix"));
            }
            // 生成的文件名
            tpl.setFileName(tplElement.elementText("fileName"));
            // 设置文件路径前缀,用于分包
            tpl.setFileSuffix(tplElement.elementText("fileSuffix"));

            conf.addTpl(tpl);
        }
    }
}


