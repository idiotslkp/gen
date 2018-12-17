package com.massestech.common.gen.gencode;

import com.massestech.common.gen.conf.Conf;
import com.massestech.common.gen.conf.parammap.DefaultTokenHandleImpl;
import com.massestech.common.gen.conf.parammap.GenericTokenParser;
import com.massestech.common.gen.conf.tpl.Tpl;
import com.massestech.common.gen.conf.tpl.TplHandle;
import com.massestech.common.gen.model.Table;
import com.massestech.common.gen.util.FileUtil;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.text.MessageFormat;

/**
 * 模板处理器,用于将模板与内容结合在一起生成文件
 */
public class TplHandleImpl implements TplHandle {

    private String tplName;

    private String absoluteFileName;


    /**
     * 处理模板
     *
     * @param conf
     * @throws IOException
     * @throws TemplateException
     */
    public void handle(Conf conf, Tpl tpl, Table table) {
        setTplName(tpl.getName());
        dealAbsoluteFileName(conf, tpl, table);
        conf.addFreemarkerParamMap("table", table);
        try {
            FileUtil.createFileByTpl(conf, this);   // 生成文件
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public void dealAbsoluteFileName(Conf conf, Tpl tpl, Table table) {

        String fileSuffix = tpl.getFileSuffix();  // 文件前缀

        String packageUrl = getPackageUrl(conf, tpl); // 基础包路径

        String filePath = conf.getParamMap().get("targetPath") + fileSuffix + packageUrl + "/";    // 生成的基础路径
        absoluteFileName = filePath + MessageFormat.format(tpl.getFileName(), table.getModelName());
    }

    private String getPackageUrl(Conf conf, Tpl tpl) {
        String packageUrl;


        if (null != tpl.getSuffix()) {
            GenericTokenParser genericTokenParser = new GenericTokenParser("${", "}", new DefaultTokenHandleImpl());
            packageUrl = genericTokenParser.parse(tpl.getSuffix());
//            packageUrl = conf.getParamMap().get("packageName") + "." + tpl.getSuffix();	// 完整的包名
        } else {
            packageUrl = conf.getParamMap().get("packageName");    // 完整的包名
        }
        packageUrl = packageUrl.replaceAll("\\.", "/");
        return packageUrl;
    }

    @Override
    public String getAbsoluteFileName() {
        return absoluteFileName;
    }
}
