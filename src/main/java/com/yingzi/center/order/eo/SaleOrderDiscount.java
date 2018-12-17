package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_sale_order_discount")
@Comment("销售单折扣")
public class SaleOrderDiscount {

    @Column(columnDefinition = "销售单id")
    Long saleOrderId;
    @Column(columnDefinition = "折扣项目编码")
    String code;
    @Column(columnDefinition = "折扣项目名称")
    String name;

    @Column(columnDefinition = "折扣金额")
    String cash;

    @Column(columnDefinition = "剩余金额")
    String notCash;
    @Column(columnDefinition = "备注")
    String remark;

}
