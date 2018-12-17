package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_repositorys")
@Comment("仓库设置")
public class RepositoryStandard {

    @Column(columnDefinition = "管控组织")
    private String ctrlDepartmentOrg;
    @Column(columnDefinition = "管控区")
    private String ctrlArea;
    @Column(columnDefinition = "备注")
    String remark;
    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;
}
