package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_EliminateRecord")
@Comment("死淘记录")
public class EliminateRecord {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "上报日期")
    Date reoportTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "淘汰申请单号")
    String eliminateCode;
    @Column(columnDefinition = "死淘类型")
    Integer eliminateStatus;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "批次")
    private String battch;
    @Column(columnDefinition = "天龄")
    private Integer feedDays;

    @Column(columnDefinition = "饲养品种")
    private String feedType;
    @Column(columnDefinition = "品系")
    private String strain;
    @Column(columnDefinition = "死淘数量合计")
    Integer eliminateSumNum;

    @Column(columnDefinition = "备注")
    String remark;

}
