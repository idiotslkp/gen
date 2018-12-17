package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_immunstandarddetail")
@Comment("免疫程序设置详细")
public class ImmunStandardDetail {

    @Column(columnDefinition = "免疫项目设置id")
    Long immunStandardId;
    @Column(columnDefinition = "天龄")
    private Integer feedDays;

    String immunItem;

    @Column(columnDefinition = "最小天龄")
    Integer minFeedDays;

    @Column(columnDefinition = "最大天龄")
    Integer maxFeedDays;


    @Column(columnDefinition = "计量")
    String dose;

    @Column(columnDefinition = "计量单位")
    private String measure;

    @Column(columnDefinition = "免疫方法")
    String immunMethod;

    @Column(columnDefinition = "备注")
    String remark;

}
