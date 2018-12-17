package com.yingzi.center.plan.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_seedarrange")
@Comment("领苗安排")
public class SeedArrange {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "安排日期")
    Date arrangeTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

//    @Column(columnDefinition = "计划进苗日期开始")
//    Date beginPlanTime;
//
//    @Column(columnDefinition = "计划进苗日期结束")
//    Date endPlanTime;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;
}
