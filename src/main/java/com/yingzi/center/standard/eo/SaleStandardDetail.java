package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "standard_salestandarddetail")
@Comment("销售预测模型设置详细")
public class SaleStandardDetail {

    @Column(columnDefinition = "销售模型id")
    Long saleStandardId;

    @Column(columnDefinition = "模型编码")
    String code;

    @Column(columnDefinition = "名称")
    String name;

    @Column(columnDefinition = "参数值")
    String paramValue;

    @Column(columnDefinition = "备注")
    String remark;

}