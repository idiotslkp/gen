package com.yingzi.center.plan.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_sale_week_plan")
@Comment("周销售计划")
public class SaleWeekPlan {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "计划员")
    String planPerson;

    @Column(columnDefinition = "计划员id")
    String planPersonId;

    @Column(columnDefinition = "计划日期")
    Date planTime;

    @Column(columnDefinition = "周")
    String weekNum;

//    @Column(columnDefinition = "管控组织")
//    String ctrlDepartmentOrg;


    @Column(columnDefinition = "计划日期开始")
    Date beginPlanTime;

    @Column(columnDefinition = "计划日期结束")
    Date endPlanTime;

//    @Column(columnDefinition = "预测模型")
//    String saleStandard;

    @Column(columnDefinition = "月销售计划")
    String monthPlan;

    @Column(columnDefinition = "月计划总量")
    Integer monthPlanSumNum;
    @Column(columnDefinition = "周计划总量")
    Integer weekPlanSumNum;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;
}
