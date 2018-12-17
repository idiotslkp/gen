package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_seedcheck")
@Comment("进苗前巡查检查项")
public class SeedCheck {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "巡查日期")
    Date checkTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "巡查人,默认当前用户")
    String checkPerson;

    @Column(columnDefinition = "巡查人id")
    String checkPersonId;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

}
