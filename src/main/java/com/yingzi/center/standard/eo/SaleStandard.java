package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "standard_salestandard")
@Comment("销售预测模型设置")
public class SaleStandard {

    @Column(columnDefinition = "模型编码")
    String code;

    @Column(columnDefinition = "名称")
    String name;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "是否启用,0.否,1,是")
    Integer enable;

    @Column(columnDefinition = "是否默认,0.否,1,是")
    Integer defaultStatus;

}