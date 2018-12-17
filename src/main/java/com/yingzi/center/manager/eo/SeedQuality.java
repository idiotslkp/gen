package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_seedquality")
@Comment("猪苗质量反馈")
public class SeedQuality {

    @Column(columnDefinition = "单号")
    String code;
    @Column(columnDefinition = "反馈日期")
    Date qualityTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

    @Column(columnDefinition = "领苗单号")
    String seedOrderCode;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "片区")
    private String area;

    @Column(columnDefinition = "领苗日期")
    Date seedTime;

    @Column(columnDefinition = "已领苗数量")
    Integer seedNum;

    @Column(columnDefinition = "技术员")
    private String technician;
    @Column(columnDefinition = "技术员id")
    private String technicianId;

    @Column(columnDefinition = "反馈数量合计")
    Integer sumQualityNum;

    @Column(columnDefinition = "供苗猪场")
    private String pigletAdress;

    @Column(columnDefinition = "批次")
    private String battch;

    @Column(columnDefinition = "详细说明")
    String remark;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

}
