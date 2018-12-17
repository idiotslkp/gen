package com.massestech.common.gen.gencode;

import com.massestech.common.gen.conf.Conf;
import com.massestech.common.gen.conf.ConfContext;
import com.massestech.common.gen.conf.ParseXml;
import com.massestech.common.gen.conf.datasource.ParseJava;
import com.massestech.common.gen.conf.tpl.Tpl;
import com.massestech.common.gen.model.Table;

import java.util.List;

public class GenCode {

    static int parseJava = 1;
    static int parseDb = 2;
    static int parsePdm = 3;

    public static void genByJava(Class clazz) throws Exception {
        ParseJava.addModel(clazz);
        GenCode.genCodeBegin(parseJava);
    }

    public static void genByPdm() {
        // 暂未实现
        GenCode.genCodeBegin(parsePdm);
    }

    public static void genByDb() {
        // 暂未实现
        GenCode.genCodeBegin(parseDb);
    }

    public static void genCodeBegin(int type) {
        Conf conf = ConfContext.getConf();
//        Conf conf = new Conf();
        conf.setParseType(type);
        // 解析xml
        ParseXml parseXml = new ParseXml();
        parseXml.parse(conf);

        GenCode genCode = new GenCode();
        genCode.genCode(conf);

        System.out.println("代码生成完毕");
    }

    /**
     * 生成文件
     *
     * @param conf
     */
    public void genCode(Conf conf) {
        // 这里用来处理参数,然后调用生成文件的方法
        List<Table> tableList = conf.getTableList();
        List<Tpl> tplList = conf.getTplList(); // 模板集合
        // 多个表格
        for (Table table : tableList) {
            // 每个表格有多个模板
            for (Tpl tpl : tplList) {
                TplHandleImpl tplHandle = new TplHandleImpl();
                tplHandle.handle(conf, tpl, table);
            }
        }
    }

}
