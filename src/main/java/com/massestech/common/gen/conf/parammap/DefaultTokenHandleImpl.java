package com.massestech.common.gen.conf.parammap;

import com.massestech.common.gen.conf.ConfContext;

/**
 * 用于替换模板里面的变量.
 */
public class DefaultTokenHandleImpl implements TokenHandler {

    @Override
    public String handleToken(String key) {
        String value = ConfContext.getConf().getParamMap().get(key);
        return value;
    }

}
