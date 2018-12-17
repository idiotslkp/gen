package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_seedorder")
@Comment("领苗单")
public class SeedOrder {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;
    @Column(columnDefinition = "批次")
    private String battch;
    @Column(columnDefinition = "领苗日期")
    Date seedTime;

    @Column(columnDefinition = "饲养品种")
    private String feedType;
    @Column(columnDefinition = "品系")
    private String strain;

    @Column(columnDefinition = "供苗猪场")
    private String pigletAdress;

    @Column(columnDefinition = "已领苗数量")
    Integer seedNum;
    @Column(columnDefinition = "重量")
    String weight;
    @Column(columnDefinition = "均重")
    String avgWeight;
    @Column(columnDefinition = "单价")
    String price;
    @Column(columnDefinition = "金额")
    String sumPrice;

    @Column(columnDefinition = "计量单位")
    private String measure;
    @Column(columnDefinition = "采购单价")
    String purchasePrcie;
    @Column(columnDefinition = "采购金额")
    String purchaseSumPrcie;

    @Column(columnDefinition = "天龄")
    private Integer feedDays;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;
}
