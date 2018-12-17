package com.yingzi.center.plan.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_sale_day_plan_detail")
@Comment("日销售计划详细")
public class SaleDayPlanDetail {

    @Column(columnDefinition = "日销售计划id")
    Long saleDayStandardId;
    @Column(columnDefinition = "养户姓名")
    private String farmerName;
    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "计划数量")
    Integer planNum;
    @Column(columnDefinition = "天龄")
    private Integer feedDays;

    @Column(columnDefinition = "进苗均重")
    String seedAvgWeight;

    @Column(columnDefinition = "供苗猪场")
    private String pigletAdress;

    @Column(columnDefinition = "均重")
    String avgWeight;

    @Column(columnDefinition = "平均耗料")
    String avgFood;

    @Column(columnDefinition = "等级")
    private String level;
    @Column(columnDefinition = "来源")
    String source;

    @Column(columnDefinition = "品系")
    private String strain;

    @Column(columnDefinition = "存栏数量")
    Integer existNum;

    @Column(columnDefinition = "已上市数量")
    Integer saleNum;

    @Column(columnDefinition = "销售品种")
    private String feedType;

}

