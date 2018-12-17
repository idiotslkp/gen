package com.massestech.common.gen.conf.tpl;

/**
 * 模板信息类,存放了模板的信息
 *
 * @author LKP
 * @version 1.0
 * @copyright 广州明动软件有限公司 Copyright (c) 2016
 * @since 2016-6-18
 */
public class Tpl {
    /**
     * 模板的名称
     */
    private String name;
    /**
     * 该模板生成的文件的路径,packageName+前缀suffix
     */
    private String suffix;
    /**
     * 生成的文件名
     */
    private String fileName;
    /**
     * 生成的文件路径前缀,用于分包
     */
    private String fileSuffix;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * 生成的文件路径以及文件名
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 生成的文件路径以及文件名
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }
}
