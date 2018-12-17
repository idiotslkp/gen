package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "order_seedorder_pigletadress")
@Comment("领苗单与猪场关联关系")
public class SeedOrder_PigletAdress {

    @Column(columnDefinition = "领苗单id")
    Long seedOrderId;

    @Column(columnDefinition = "猪场id")
    Long pigletAdressId;

}
