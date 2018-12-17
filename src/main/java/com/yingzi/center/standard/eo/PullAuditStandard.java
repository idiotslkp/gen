package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "standard_pull_audit_standard")
@Comment("领料审批标准设置")
public class PullAuditStandard {

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

    @Column(columnDefinition = "备注")
    String remark;

}

