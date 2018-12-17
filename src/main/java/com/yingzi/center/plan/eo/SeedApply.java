package com.yingzi.center.plan.eo;


import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_seedapply")
@Comment("领苗申请")
public class SeedApply {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "申请日期")
    Date applyTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "品种")
    String breeding;

    @Column(columnDefinition = "片区")
    private String area;

    @Column(columnDefinition = "清栏时间")
    private Date cleanStyTime;

    @Column(columnDefinition = "空栏天数")
    Date nullStyTime;

    @Column(columnDefinition = "技术员")
    private String technician;
    @Column(columnDefinition = "技术员id")
    private String technicianId;

    @Column(columnDefinition = "申请数量")
    Integer applyNum;

    @Column(columnDefinition = "计划进苗日期")
    Date planTime;

    @Column(columnDefinition = "饲养规模")
    private String feedScal;

    @Column(columnDefinition = "已安排数量")
    Integer havaArrangeNum;

    @Column(columnDefinition = "批次")
    private String battch;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

}
