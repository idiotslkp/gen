package com.massestech.common.gen.conf.tpl;

/**
 * 模板处理器
 */
public interface TplHandle {

    /**
     * 获取模板名称
     */
    String getTplName();

    /**
     * 获取文件全路径名
     */
    String getAbsoluteFileName();

}
