package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_eliminateapply")
@Comment("淘汰申请")
public class EliminateApply {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "申请日期")
    Date applyTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "申请人")
    String applyPerson;
    @Column(columnDefinition = "片区")
    private String area;
    @Column(columnDefinition = "管控区")
    private String ctrlArea;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;
    @Column(columnDefinition = "批次")
    private String battch;
    @Column(columnDefinition = "领苗日期")
    Date seedTime;
    @Column(columnDefinition = "天龄")
    private Integer feedDays;
    @Column(columnDefinition = "供苗猪场")
    private String pigletAdress;
    @Column(columnDefinition = "进苗头数")
    Integer seedNum;

    @Column(columnDefinition = "饲养品种")
    private String feedType;
    @Column(columnDefinition = "品系")
    private String strain;

    @Column(columnDefinition = "存栏数量")
    Integer existNum;

    @Column(columnDefinition = "申请数量")
    Integer applyNum;
    @Column(columnDefinition = "均重")
    String avgWeight;
    @Column(columnDefinition = "淘汰日期")
    Date eliminateTime;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "附件id")
    String fileId;
    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;
}
