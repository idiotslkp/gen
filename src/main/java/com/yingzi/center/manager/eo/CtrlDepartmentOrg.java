package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_department")
@Comment("管控组织")
public class CtrlDepartmentOrg {

    @Column(columnDefinition = "编码")
    String code;

    @Column(columnDefinition = "管控组织")
    private String ctrlDepartmentOrg;

    @Column(columnDefinition = "名称")
    String name;

    @Column(columnDefinition = "兽医")
    String doctor;

    @Column(columnDefinition = "负责人")
    String mainPerson;

    @Column(columnDefinition = "展示顺序")
    Integer order;

    @Column(columnDefinition = "父节点id")
    Long parentId;

    @Column(columnDefinition = "是否是顶层节点,0.否,1.是")
    Integer parent;
}
