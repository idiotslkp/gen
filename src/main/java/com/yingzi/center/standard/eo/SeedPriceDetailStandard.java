package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "plan_seedprice_standard_detail")
@Comment("领苗价格详细")
public class SeedPriceDetailStandard {

    @Column(columnDefinition = "领苗价格id")
    Long seedPriceId;

    @Column(columnDefinition = "饲养品种")
    private String feedType;
    @Column(columnDefinition = "品系")
    private String strain;
    @Column(columnDefinition = "供苗猪场")
    private String pigletAdress;

    @Column(columnDefinition = "基础重量")
    String baseWeight;

    @Column(columnDefinition = "基础价格")
    String basePrice;

    @Column(columnDefinition = "不足价格")
    String ltPrice;

    @Column(columnDefinition = "超重价格")
    String gtPrice;

    @Column(columnDefinition = "折扣率")
    String disCount;
}
