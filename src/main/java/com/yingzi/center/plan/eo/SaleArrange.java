package com.yingzi.center.plan.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_sale_arrange")
@Comment("销售安排")
public class SaleArrange {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "安排人")
    String arrangePerson;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

    @Column(columnDefinition = "销售日期")
    Date saleTime;
    @Column(columnDefinition = "安排总数量")
    Integer arrangeSumNum;
    @Column(columnDefinition = "预定总数量")
    Integer planSumNum;

    @Column(columnDefinition = "备注")
    String remark;
    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

}
