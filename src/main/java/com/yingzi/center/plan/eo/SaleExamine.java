package com.yingzi.center.plan.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_saleexamine")
@Comment("售前巡查结果")
public class SaleExamine {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "巡查日期")
    Date examineTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "批次")
    private String battch;
    @Column(columnDefinition = "检测员")
    String examinePerson;
    @Column(columnDefinition = "可上市情况")
    String saleMsg;

    @Column(columnDefinition = "天龄")
    private Integer feedDays;
    @Column(columnDefinition = "存栏数量")
    Integer existNum;
    @Column(columnDefinition = "均重")
    String avgWeight;

    @Column(columnDefinition = "等级")
    private String level;
    @Column(columnDefinition = "淋猪水源")
    String water;
    @Column(columnDefinition = "道路宽度")
    String loadWidth;
    @Column(columnDefinition = "赶猪走道")
    String corridor;
    @Column(columnDefinition = "赶猪台")
    String roof;

    @Column(columnDefinition = "备注")
    String remark;

}
