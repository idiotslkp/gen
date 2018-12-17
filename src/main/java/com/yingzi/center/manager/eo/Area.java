package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_area")
@Comment("片区")
public class Area {

    @Column(columnDefinition = "部门id")
    Long departmentId;

    @Column(columnDefinition = "编码")
    String code;

    @Column(columnDefinition = "名称")
    String name;

    @Column(columnDefinition = "技术员")
    private String technician;

    @Column(columnDefinition = "展示顺序")
    Integer order;

    @Column(columnDefinition = "地区")
    String area;

    @Column(columnDefinition = "管控区")
    private String ctrlDepartmentOrg;

}
