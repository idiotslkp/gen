package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_saleorder")
@Comment("销售订单")
public class PlanSaleOrder {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "要货日期")
    Date requireTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "客户名称")
    String costomer;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "销售品种")
    private String feedType;

    @Column(columnDefinition = "数量")
    Integer saleNum;

    @Column(columnDefinition = "计量单位")
    private String measure;

    @Column(columnDefinition = "单价")
    String price;

    @Column(columnDefinition = "预计金额")
    String sumPrice;

    @Column(columnDefinition = "标准上市重量")
    String sumWeight;

    @Column(columnDefinition = "订货要求")
    String requireMsg;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

}
