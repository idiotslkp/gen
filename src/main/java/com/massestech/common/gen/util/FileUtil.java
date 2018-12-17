package com.massestech.common.gen.util;

//import com.massestech.common.gen.model.Conf;

import com.massestech.common.gen.model.Table;
//import com.massestech.common.gen.model.Tpl;
import com.massestech.common.gen.conf.tpl.TplHandle;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文件相关工具类
 *
 * @author LKP
 * @version 1.0
 * @copyright 锋锐科技 Copyright (c) 2017
 * @since 2017-1-13
 */
public class FileUtil {

//	/**
//	 * 生成文件
//	 * @param <T>
//	 *
//	 * @throws IOException
//	 * @throws TemplateException
//	 */
//	public static <T> void genCode(T collection, Conf conf) throws IOException, TemplateException {
//		// 判断是生成pdm里面所有的表呢,还是只生成对应的一个
//        if (collection instanceof List) {
//        	List<Table> tableList = (List<Table>) collection;
//        	// 遍历生成文件
//        	for (Table table : tableList) {
//        		createFile(conf, table);
//        	}
//        } else if (collection instanceof Map) {
//        	Map<String, Table> tableMap = (Map<String, Table>) collection;
//        	Table table = tableMap.get(conf.getParamMap().get("modelName"));
//        	createFile(conf, table);
//        } else {
//        	Table table = (Table) collection;
//        	createFile(conf, table);
//        }
//	}
//
//	/**
//	 * 创建文件
//	 * @param conf 配置文件信息
//	 * @param table
//	 * @throws IOException
//	 * @throws TemplateException
//	 */
//	private static void createFile(Conf conf, Table table) throws IOException, TemplateException {
//		List<Tpl> tplList = conf.getTplList(); // 模板集合
//		Map<String, String> paramMap = conf.getParamMap();
//		// 这里遍历所有需要生成的文件模板
//		for (Tpl tpl : tplList) {
//			String packageUrl =  "";
//			if (null != tpl.getSuffix()) {
//				packageUrl = paramMap.get("packageName") + "." + tpl.getSuffix();	// 完整的包名
//			} else {
//				packageUrl = paramMap.get("packageName");	// 完整的包名
//			}
//			System.out.println("-------------------------");
//			// 获取模板
//			Template template = getTemplate(conf, tpl.getName());
//			//建立数据模型（Map）
//			Map<String, Object> root = new HashMap<String, Object>();
//
//			root.put("parammap", paramMap);	// 参数map
//			root.put("table", table);
//			// 文件的路径 = 目标的路径 + 包名路径 + 文件名称
//			String apiPath = null;
//			if (tpl.getIsApi().equals("true")) {
//				apiPath = "api\\";
//			} else {
//				apiPath = "provider\\";
//			}
//
//			String filePath = paramMap.get("targetPath") + apiPath + packageUrl.replaceAll("\\.", "/") + "/";	// 生成的基础路径
//			filePath += MessageFormat.format(tpl.getFileName(), table.getModelName());
//			File file = new File(filePath);
//			// 判断需要生成的文件的路径是否已经存在,如果不存在,那么我们帮他创建一个
//			if (!file.exists()) {
//				file.getParentFile().mkdirs();
//			}
//			FileWriter writer = new FileWriter(file);
//			//数据与模板合并（数据+模板=输出）
//			template.process(root, writer);
//			writer.flush();
//			writer.close();
//		}
//	}
//
//	/**
//	 * 根据模板名称获取模板
//	 *
//	 * @return
//	 * @throws IOException
//	 */
//	public static Template getTemplate(Conf conf, String templateName) throws IOException {
//		// 创建配置实例Cofiguration
//		Configuration configuration = new Configuration();
//
//		// 设置模板文件目录
//		configuration.setDirectoryForTemplateLoading(new File(FileUtil.class.getClassLoader().getResource(conf.getParamMap().get("tplsPackageUrl")).getPath()));
//		// 获取模板（template）
//		Template template = configuration.getTemplate(templateName);
//		return template;
//	}

    // 生成模板
    public static void createFileByTpl(com.massestech.common.gen.conf.Conf conf, TplHandle tpl) throws Exception {
        String filePath = tpl.getAbsoluteFileName(); // 获取完整的文件路径+文件名
        // 获取模板
        Template template = conf.getTemplate(tpl.getTplName());    // 获取模板
        File file = new File(filePath);
        System.out.println("--》" + file.getPath());
        // 判断需要生成的文件的路径是否已经存在,如果不存在,那么我们帮他创建一个
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        FileWriter writer = new FileWriter(file);
        //数据与模板合并（数据+模板=输出）
        template.process(conf.getFreemarkerParamMap(), writer);
        writer.flush();
        writer.close();
    }

    public static File getFileByFilePath(String filePath) {
        File file = new File(FileUtil.class.getClassLoader().getResource(filePath).getPath());
        return file;
    }

}
