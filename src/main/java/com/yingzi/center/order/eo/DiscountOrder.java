package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_discount_order")
@Comment("折扣单")
public class DiscountOrder {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "申请日期")
    Date applyTime;

    @Column(columnDefinition = "生效日期")
    private Date effectTime;
    @Column(columnDefinition = "失效日期")
    private Date expiredTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

}
