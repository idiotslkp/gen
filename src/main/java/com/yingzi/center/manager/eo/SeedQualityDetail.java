package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_seedquality")
@Comment("猪苗质量反馈详情")
public class SeedQualityDetail {

    @Column(columnDefinition = "猪苗质量反馈id")
    Long seedQualityId;
    // todo 反馈类型需要按照配置的方式去进行配置以及展示.
    @Column(columnDefinition = "反馈类型")
    Integer qualityType;
    @Column(columnDefinition = "数量")
    Integer qualityNum;
    @Column(columnDefinition = "均重")
    String avgWeight;
    @Column(columnDefinition = "总重量")
    String sumWeight;
    @Column(columnDefinition = "承担方,0.猪场承担；1.公司承担；")
    Integer bear;
    @Column(columnDefinition = "处理方式,0.降价,1.淘汰")
    Integer dealType;
    @Column(columnDefinition = "单价")
    String price;
    @Column(columnDefinition = "金额")
    String sumPrice;
    @Column(columnDefinition = "备注")
    String remark;
    @Column(columnDefinition = "附件id")
    String fileId;

}
