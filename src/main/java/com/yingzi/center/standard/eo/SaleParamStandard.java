package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "standard_param_standard")
@Comment("销售预测模型参数设置")
public class SaleParamStandard {

    @Column(columnDefinition = "编码")
    String code;

    @Column(columnDefinition = "名称")
    String name;

}
