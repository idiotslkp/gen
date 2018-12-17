package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_food_record")
@Comment("饲养记录")
public class FoodRecord {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "记录日期")
    Date recordTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;
    @Column(columnDefinition = "批次")
    private String battch;
    @Column(columnDefinition = "天龄")
    private Integer feedDays;
    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "猪群情况")
    String remark1;
    @Column(columnDefinition = "上次方案落实情况")
    String remark2;


}
