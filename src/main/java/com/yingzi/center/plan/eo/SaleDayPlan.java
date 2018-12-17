package com.yingzi.center.plan.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_sale_day_plan")
@Comment("日销售计划")
public class SaleDayPlan {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "计划日期")
    Date planTime;
    @Column(columnDefinition = "销售组织")
    private String ctrlDepartmentOrg;

    @Column(columnDefinition = "销售日期")
    Date saleTime;

    @Column(columnDefinition = "计划员")
    String planPerson;
    @Column(columnDefinition = "计划员id")
    String planPersonId;
    @Column(columnDefinition = "计划总数量")
    Integer planSumNum;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;


}
