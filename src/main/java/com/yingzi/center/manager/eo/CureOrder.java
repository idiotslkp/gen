package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_cure_order")
@Comment("处方单")
public class CureOrder {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "诊断日期")
    Date cureTime;

    @Column(columnDefinition = "管控组织")
    private String ctrlDepartmentOrg;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "批次")
    private String battch;

    @Column(columnDefinition = "技术员")
    private String technician;

    @Column(columnDefinition = "天龄")
    private Integer feedDays;
    @Column(columnDefinition = "供苗猪场")
    private String pigletAdress;
    @Column(columnDefinition = "进苗日期")
    Date seedTime;
    @Column(columnDefinition = "发病日期")
    Date diseaseTime;

    @Column(columnDefinition = "饲养品种")
    private String feedType;
    @Column(columnDefinition = "品系")
    private String strain;

    @Column(columnDefinition = "病症")
    String disease;

    @Column(columnDefinition = "病症分类")
    String diseaseStatus;
    @Column(columnDefinition = "发病数量")
    Integer diseaseNum;
    @Column(columnDefinition = "症状描述")
    String descr;
    @Column(columnDefinition = "治疗方案")
    String cure;
    @Column(columnDefinition = "附件id")
    String fileId;


}
