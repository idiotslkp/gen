package com.massestech.common.gen.conf;

import com.massestech.common.gen.conf.tpl.Tpl;
//import com.massestech.common.gen.model.FieldType;
import com.massestech.common.gen.model.FieldType;
import com.massestech.common.gen.model.Table;
import com.massestech.common.gen.util.FileUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.dom4j.Element;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 配置文件,存放conf.xml解析后的内容
 */
public class Conf {
    // 参数map
    private final Map<String, String> paramMap = new HashMap<>();
    // 模板的集合
    private final List<Tpl> tplList = new ArrayList<>();
    //    // mybatis需要使用的字段的map
//    public final Map<String, FieldType> fieldTypeMap = new HashMap<>();
    public final List<FieldType> fieldTypeList = new ArrayList<>();
    // freemarker模板配置类
    private final Configuration configuration = new Configuration();
    //  freemarker模板里面的参数map
    private Map<String, Object> freemarkerParamMap = new HashMap<>();
    // 要生成的表的集合
    private List<Table> tableList = new ArrayList<>();

    private int parseType;

    private Element confElement;

    /**
     * 初始化freemarker配置,解析paramMap的时候,调用该方法
     */
    public void initConfiguration(File dir) {
        // 设置模板文件目录
        try {
            configuration.setDirectoryForTemplateLoading(dir);
        } catch (IOException e) {
            System.out.println("设置模板文件目录出错,请检查");
            e.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 根据模板名称,获取模板
     *
     * @param templateName 模板名称
     */
    public Template getTemplate(String templateName) throws IOException {
        Template template = configuration.getTemplate(templateName);
        return template;
    }

    public Map<String, String> getParamMap() {
        return paramMap;
    }

    public List<Tpl> getTplList() {
        return tplList;
    }

    public void addFieldType(FieldType fieldType) {
        fieldTypeList.add(fieldType);
    }


    public List<FieldType> getFieldTypeList() {
        return fieldTypeList;
    }

    public Map<String, Object> getFreemarkerParamMap() {
        return freemarkerParamMap;
    }

    public void addParamMap(String key, String value) {
        paramMap.put(key, value);
        addFreemarkerParamMap(key, value);  // 当有参数加入到map里面的时候,同步将参数放到freemarker参数列表里面
    }

    public void addTpl(Tpl tpl) {
        tplList.add(tpl);
    }

    /**
     * 设置freemarker参数
     *
     * @param key
     * @param value
     */
    public void addFreemarkerParamMap(String key, Object value) {
        freemarkerParamMap.put(key, value);
    }

    /**
     * 添加要生成的table
     *
     * @param table
     */
    public void addTabel(Table table) {
        tableList.add(table);
    }

    public void setParseType(int parseType) {
        this.parseType = parseType;
    }

    public int getParseType() {
        return parseType;
    }

    public Element getConfElement() {
        return confElement;
    }

    public void setConfElement(Element confElement) {
        this.confElement = confElement;
    }

    public List<Table> getTableList() {
        return tableList;
    }
}
