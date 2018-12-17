package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_food_record_detail")
@Comment("饲养记录详细")
public class FoodRecordDetail {

    @Column(columnDefinition = "单号")
    String code;
    @Column(columnDefinition = "天龄")
    private Integer feedDays;

    @Column(columnDefinition = "日期")
    Date foodTime;
    @Column(columnDefinition = "饲料品种")
    String feedStatus;

    @Column(columnDefinition = "饲料包数")
    Float feedNum;

    @Column(columnDefinition = "入库包数")
    Float feedAdd;

    @Column(columnDefinition = "饲料库存量")
    Float feedExist;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;
    @Column(columnDefinition = "批次")
    private String battch;

    @Column(columnDefinition = "0.饲喂记录,1.免疫记录")
    private Integer foodStauts;

}
