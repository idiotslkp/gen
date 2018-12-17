package com.yingzi.center.plan.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_feedapply")
@Comment("领料申请")
public class FeedApply {

    @Column(columnDefinition = "单号")
    String code;
    @Column(columnDefinition = "申请人")
    String applyPerson;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "片区")
    private String area;

    @Column(columnDefinition = "批次")
    private String battch;
    @Column(columnDefinition = "天龄")
    private Integer feedDays;
    @Column(columnDefinition = "饲养品种")
    private String feedType;
    @Column(columnDefinition = "品系")
    private String strain;

    @Column(columnDefinition = "存栏数量")
    Integer existNum;

    @Column(columnDefinition = "饲料库存量")
    String feedExist;

    @Column(columnDefinition = "库存可用天数")
    Integer feedUseDays;

    @Column(columnDefinition = "头均喂料包数")
    String avgFeed;

    @Column(columnDefinition = "申请包数")
    Integer applyFeed;

    @Column(columnDefinition = "申请日期")
    Date applyTime;

    @Column(columnDefinition = "申请原因")
    String remark;
    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

//    @Column(columnDefinition = "是否已结算,0.否,1.是")
//    Integer statementStatus;

}
