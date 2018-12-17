import com.massestech.common.gen.gencode.GenCode;
import com.yingzi.center.standard.eo.MaterielStandard;
import org.junit.jupiter.api.Test;

/**
 * 负责代码生成
 *
 * @author LKP
 * @version 1.0
 * @copyright 锋锐科技 Copyright (c) 2016
 * @since 2016-6-18
 */
public class GenBegin {

    static final String ipAddr = "http://erptest.yangxiang.com:9999";

    @Test
    public void genByJava() throws Exception {
        GenCode.genByJava(MaterielStandard.class);
    }

    @Test
    public void genByPdm() {
        // 暂未实现
        GenCode.genByPdm();
    }

    @Test
    public void genByDb() {
        // 暂未实现
        GenCode.genByDb();
    }

}
