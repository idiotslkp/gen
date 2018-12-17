package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "standard_freight_standard")
@Comment("运补折扣设置")
public class FreightStandard {

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "生效日期")
    private Date effectTime;
    @Column(columnDefinition = "失效日期")
    private Date expiredTime;

    @Column(columnDefinition = "备注")
    String remark;
    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

}
