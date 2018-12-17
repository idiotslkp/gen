package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "standard_sale_level_standard")
@Comment("销售等级设置")
public class SaleLevelStandard {

    @Column(columnDefinition = "等级")
    private String level;

    @Column(columnDefinition = "名称")
    String name;


    @Column(columnDefinition = "起始均重")
    String beginAvgWeight;

    @Column(columnDefinition = "截止均重")
    String endAvgWeight;

    @Column(columnDefinition = "描述")
    String remark;

    @Column(columnDefinition = "是否启用,0.否,1,是")
    Integer enable;

    @Column(columnDefinition = "是否默认,0.否,1,是")
    Integer defaultStatus;


}
