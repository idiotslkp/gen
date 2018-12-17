package com.yingzi.center.plan.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_seedarrange_detail")
@Comment("领苗安排详细")
public class SeedArrangeDetail {

    @Column(columnDefinition = "领苗安排id")
    Long seedArrangeId;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "清栏时间")
    private Date cleanStyTime;

    @Column(columnDefinition = "空栏天数")
    Date nullStyTime;

    @Column(columnDefinition = "批次")
    private String battch;

    @Column(columnDefinition = "饲养规模")
    private String feedScal;

    @Column(columnDefinition = "已领苗数量")
    Integer seedNum;

    @Column(columnDefinition = "计划数量")
    Integer planNum;

    @Column(columnDefinition = "已安排数量")
    Integer havaArrangeNum;

    @Column(columnDefinition = "计划进苗日期")
    Date planTime;

    @Column(columnDefinition = "安排数量")
    Integer arrangeNum;

    @Column(columnDefinition = "供苗猪场")
    private String pigletAdress;

    @Column(columnDefinition = "片区")
    private String area;

    @Column(columnDefinition = "技术员")
    private String technician;
    @Column(columnDefinition = "技术员id")
    private String technicianId;

    @Column(columnDefinition = "备注")
    String remark;

}
