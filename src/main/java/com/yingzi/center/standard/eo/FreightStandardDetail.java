package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "standard_freight_standard_detail")
@Comment("运补折扣设置")
public class FreightStandardDetail {

    @Column(columnDefinition = "销售价格id")
    Long freightStandardId;

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "名称")
    String name;

    @Column(columnDefinition = "开始运输距离")
    String beginKm;
    @Column(columnDefinition = "结束运输距离")
    String endKm;

    @Column(columnDefinition = "折扣")
    String discount;

}
