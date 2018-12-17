package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_immunitemstandard")
@Comment("免疫项目设置")
public class ImmunItemStandard {

    @Column(columnDefinition = "编码")
    String code;

    @Column(columnDefinition = "名称")
    String name;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "参考天龄")
    Integer referDays;

    @Column(columnDefinition = "参考剂量")
    String referDose;

    @Column(columnDefinition = "计量单位")
    private String measure;

    @Column(columnDefinition = "免疫方法")
    String immunMethod;

    @Column(columnDefinition = "是否启用,0.否,1,是")
    Integer enable;

    @Column(columnDefinition = "备注")
    String remark;

}
