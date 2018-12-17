package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_immunitemstandarddetail")
@Comment("免疫项目设置详细")
public class ImmunItemStandardDetail {

    @Column(columnDefinition = "免疫项目设置id")
    Long immunItemStandardId;
    @Column(columnDefinition = "疫苗编码")
    String code;

    @Column(columnDefinition = "名称")
    String name;

    @Column(columnDefinition = "含量比例")
    String percent;

    @Column(columnDefinition = "计量单位")
    private String measure;

    @Column(columnDefinition = "备注")
    String remark;

}
