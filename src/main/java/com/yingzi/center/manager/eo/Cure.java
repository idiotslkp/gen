package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_cure")
@Comment("保健治疗方案")
public class Cure {

    @Column(columnDefinition = "生效日期")
    private Date effectTime;
    @Column(columnDefinition = "失效日期")
    private Date expiredTime;
    @Column(columnDefinition = "管控组织")
    private String ctrlDepartmentOrg;

    @Column(columnDefinition = "类别")
    String cureStatus;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

}
