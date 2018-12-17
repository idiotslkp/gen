package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "standard_sale_price_standard_detaid")
@Comment("销售价格设置详细")
public class SalePriceStandardDetail {

    @Column(columnDefinition = "销售价格id")
    Long salePriceStandardId;

    @Column(columnDefinition = "品系")
    private String strain;

    @Column(columnDefinition = "等级")
    private String level;

    @Column(columnDefinition = "起始均重")
    String beginAvgWeight;

    @Column(columnDefinition = "截止均重")
    String endAvgWeight;

    @Column(columnDefinition = "基础价格")
    String basePrice;

    @Column(columnDefinition = "计量单位")
    private String measure;

}
