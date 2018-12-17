package com.yingzi.center.plan.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_sale_arrange_detail")
@Comment("销售安排")
public class SaleArrangeDetail {

    @Column(columnDefinition = "日销售计划id")
    Long saleArrangeId;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "安排数量")
    Integer arrangeNum;

    @Column(columnDefinition = "客户名称")
    String costomer;

    @Column(columnDefinition = "计划数量")
    Integer planNum;

    @Column(columnDefinition = "要货数量")
    Integer requireNum;

    @Column(columnDefinition = "订货要求")
    String requireMsg;

    @Column(columnDefinition = "均重")
    String avgWeight;

    @Column(columnDefinition = "等级")
    private String level;
    @Column(columnDefinition = "供苗猪场")
    private String pigletAdress;

    @Column(columnDefinition = "天龄")
    private Integer feedDays;

    @Column(columnDefinition = "存栏数量")
    Integer existNum;

    @Column(columnDefinition = "单号")
    String saleOrderCode;
    @Column(columnDefinition = "备注")
    String remark;

}
