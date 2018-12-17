package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_discount_order_detail")
@Comment("折扣单")
public class DiscountOrderDetail {

    @Column(columnDefinition = "折扣单id")
    Long discountOrderId;
    @Column(columnDefinition = "客户编码")
    String costomerCode;

    @Column(columnDefinition = "客户名称")
    String costomer;
    @Column(columnDefinition = "折扣项目编码")
    String code;
    @Column(columnDefinition = "折扣项目名称")
    String name;

    @Column(columnDefinition = "已兑现金额")
    String havaCash;

    @Column(columnDefinition = "剩余金额")
    String notCash;
    @Column(columnDefinition = "备注")
    String remark;

}
