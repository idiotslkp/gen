package com.massestech.common.gen.util;

//import com.massestech.common.gen.model.FieldType;
//import com.massestech.common.gen.model.Conf;
//import com.massestech.common.gen.model.Tpl;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.*;

/**
 * 获取模板的工具类
 *
 * @author LKP
 * @version 1.0
 * @copyright 锋锐科技 Copyright (c) 2016
 * @since 2016-6-2
 */
public class TemplateUtil {

//	 private static Conf conf = null;	// 获取conf.xml的所有配置信息
//
//	/**
//	 * 开始代码的生成
//	 * @throws Exception
//	 */
//	public static <T> void genCodeBegin() throws Exception {
//		Conf conf = TemplateUtil.getConf();	// 获取conf.xml的所有配置信息
//
//		T collection = null;
//		if ("false".equals(conf.getParamMap().get("isPdm"))) {
//			// 数据库
//			collection = (T) ParseDataBaseUtil.parseDataBaseTable(conf);
//		}
//		else if (conf.getParamMap().get("modelName") == null || conf.getParamMap().get("modelName").trim().equals("") )
//		{
//			// pdm,并且生成全部
//			collection = ParsePdmUtil.parsePdm(conf, ArrayList.class); // 解析pdm文件
//		} else {
//			// pdm,只生成固定某一张
//			collection = ParsePdmUtil.parsePdm(conf, HashMap.class); // 解析pdm文件
//		}
//		// 生成文件
//		FileUtil.genCode(collection, conf);
//		System.out.println("如果没有报错的话,那么-->代码生成完毕");
//	}
//
//	/**
//	 * 获取配置文件信息
//	 *
//	 * @return
//	 */
//	public static Conf getConf() {
//		Element confElement = getConfElement();
//		if (conf == null) {
//			conf = new Conf(); // 创建存放配置文件的容器
//		}
//
//		setParamList(confElement, conf);
//
//		setTplList(confElement, conf); // 设置模板信息
//		// 设置mybatis的相关信息
//		mybatisConfig(confElement.element("FieldTypes"), conf);
//		return conf;
//	}
//
//	/**
//	 * 设置自定义参数
//	 * @author LKP
//	 * @Date 2017-1-13
//	 * @param confElement
//	 * @param conf
//	 */
//	private static void setParamList(Element confElement, Conf conf) {
//		// 获取参数map节点
//		Element paramMapElements = confElement.element("parammap");
//		// 定义参数Map的集合
//		Map<String, String> paramMap = new HashMap<String, String>();
//		Iterator<Element> elementIterator = paramMapElements.elementIterator();
//		while (elementIterator.hasNext()) {
//			Element mapElement = elementIterator.next();
//			String key = mapElement.getName();
//			String value = mapElement.getText();
//			paramMap.put(key, value);
//		}
//
//		// 设置参数
//		conf.setParamMap(paramMap);
//	}
//
//	/**
//	 * 设置模板信息
//	 * @author LKP
//	 * @Date 2017-1-13
//	 * @param confElement
//	 * @param conf
//	 */
//	private static void setTplList(Element confElement, Conf conf) {
//		// 获取所有的模板元素
//		Element tplElements = confElement.element("tpls");
//		// 定义模板的集合
//		List<Tpl> tplList = new ArrayList<Tpl>();
//		// 迭代所有模板并将其设置到配置文件的容器
//		Iterator<Element> tplElementIt = tplElements.elementIterator("tpl");
//		while (tplElementIt.hasNext()) {
//			Element tplElement = (Element) tplElementIt.next();
//			Tpl tpl = new Tpl(); // 定义模板类
//			// 存放模板的名称
//			tpl.setName(tplElement.elementText("name"));
//			String suffix = tplElement.elementText("suffix");
//			if (!"".equals(suffix)) {
//				// 模板的前缀包名
//				tpl.setSuffix(tplElement.elementText("suffix"));
//			}
//			// 生成的文件名
//			tpl.setFileName(tplElement.elementText("fileName"));
//			tpl.setIsApi(tplElement.elementText("isApi")); // 设置是否是api包
//			tplList.add(tpl);
//		}
//		// 设置模板的集合
//		conf.setTplList(tplList);
//	}

    /**
     * 获取配置文件信息元素节点
     */
    public static Element getConfElement() {
        SAXReader reader = new SAXReader();
        // 加载配置文件
        InputStream in = TemplateUtil.class.getClassLoader().getResourceAsStream("conf.xml");

        if (null == in) {
            in = TemplateUtil.class.getClassLoader().getResourceAsStream("/" + "conf.xml");
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
        // 获取到我们想要的节点元素
        Element confElement = (Element) path.selectSingleNode(document);
        return confElement;
    }

//	/**
//	 * mybatis相关配置信息
//	 *
//	 * @param tableElements
//	 */
//	public static void mybatisConfig(Element tableElements, Conf conf) {
//		Map<String, FieldType> fieldTypeMap = new HashMap<String, FieldType>();
//		// 获取mybatis配置相关信息元素迭代器
//		Iterator<Element> it = tableElements.elementIterator("FieldType");
//		while (it.hasNext()) {
//			Element fieldTypesEle = (Element) it.next();
//			FieldType fieldType = new FieldType();
//			// 数据库类型
//			String sqlFieldType = fieldTypesEle.elementText("sqlFieldType").toLowerCase();
//			fieldType.setSqlFieldType(sqlFieldType);
//			// model字段类型
//			fieldType.setModelFieldType(fieldTypesEle.elementText("modelFieldType"));
//			// mybatis类型
//			fieldType.setMybatisFieldType(fieldTypesEle.elementText("mybatisFieldType"));
//			String importClass = fieldTypesEle.elementText("importClass");
//			if (!"".equals(importClass)) {
//				// 该字段对应的model可能需要导入的类
//				fieldType.setImportClass(fieldTypesEle.elementText("importClass"));
//			}
//			// 存放到集合中去
//			fieldTypeMap.put(sqlFieldType, fieldType);
//		}
//		conf.setFieldTypeMap(fieldTypeMap);
//	}

}
