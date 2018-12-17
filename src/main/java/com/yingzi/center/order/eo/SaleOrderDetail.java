package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_sale_order_detail")
@Comment("销售单明细")
public class SaleOrderDetail {

    @Column(columnDefinition = "销售单id")
    Long saleOrderId;

    @Column(columnDefinition = "数量")
    Integer saleNum;

    @Column(columnDefinition = "毛重")
    String sumWeight;

    @Column(columnDefinition = "皮重")
    String subWeight;
    @Column(columnDefinition = "净重")
    String weight;

    @Column(columnDefinition = "单价")
    String price;

    @Column(columnDefinition = "金额")
    String sumPrice;

    @Column(columnDefinition = "备注")
    String remark;

}
