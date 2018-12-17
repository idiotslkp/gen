package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_feed_order_detail")
@Comment("领料详细单")
public class FeedOrderDetail {

    @Column(columnDefinition = "领料单id")
    Long feedOrderId;
    @Column(columnDefinition = "物料编码")
    String code;
    @Column(columnDefinition = "物料名称")
    String name;
    @Column(columnDefinition = "规格")
    String standard;
    @Column(columnDefinition = "计量单位")
    private String measure;

    @Column(columnDefinition = "数量")
    Integer countNum;

    @Column(columnDefinition = "单价")
    String price;

    @Column(columnDefinition = "金额")
    String sumPrice;

    @Column(columnDefinition = "仓库")
    String repository;
    @Column(columnDefinition = "批次")
    private String battch;

}
