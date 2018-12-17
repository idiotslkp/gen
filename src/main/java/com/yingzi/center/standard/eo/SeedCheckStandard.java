package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_seedcheck_standard")
@Comment("进苗前巡查模板")
public class SeedCheckStandard {

    @Column(columnDefinition = "编码")
    String code;
    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "名称")
    String name;
    @Column(columnDefinition = "是否启用,0.否,1,是")
    Integer enable;


}
