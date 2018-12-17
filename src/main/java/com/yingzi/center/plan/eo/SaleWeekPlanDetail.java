package com.yingzi.center.plan.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_sale_week_plan_detail")
@Comment("周销售计划详细")
public class SaleWeekPlanDetail {

    @Column(columnDefinition = "周销售计划id")
    Long saleWeekStandardId;
    @Column(columnDefinition = "预计销售日期")
    Date planTime;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;
    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "进苗日期")
    Date seedTime;

    @Column(columnDefinition = "销售品种")
    private String feedType;
    @Column(columnDefinition = "品系")
    private String strain;
    @Column(columnDefinition = "存栏数量")
    Integer existNum;

    @Column(columnDefinition = "已上市数量")
    Integer saleNum;

    @Column(columnDefinition = "天龄")
    private Integer feedDays;
    @Column(columnDefinition = "均重")
    String avgWeight;

    @Column(columnDefinition = "头均喂料包数")
    String avgFeed;

    @Column(columnDefinition = "来源猪场")
    private String pigletAdress;

}

