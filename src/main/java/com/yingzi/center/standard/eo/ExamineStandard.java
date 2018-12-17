package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_examinestandard")
@Comment("猪场检查表设置")
public class ExamineStandard {

    @Column(columnDefinition = "编码")
    String code;
    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "名称")
    String name;
    @Column(columnDefinition = "是否启用,0.否,1,是")
    Integer enable;

    @Column(columnDefinition = "备注")
    String remark;

}
