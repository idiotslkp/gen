package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_pullfeedstandard")
@Comment("领料规则设置")
public class PullStandardDetail {

    @Column(columnDefinition = "领料规则id")
    Long pullStandardId;
    @Column(columnDefinition = "物料编码")
    String code;
    @Column(columnDefinition = "物料名称")
    String name;
    @Column(columnDefinition = "规格")
    String standard;
    @Column(columnDefinition = "计量单位")
    private String measure;

    @Column(columnDefinition = "起始天龄")
    private Integer beginFeedDays;
    @Column(columnDefinition = "截止天龄")
    private Integer endFeedDays;

    @Column(columnDefinition = "平均领用数量")
    String avgPullNum;

    @Column(columnDefinition = "提前天数")
    Integer beforeDays;

    @Column(columnDefinition = "提示异常百分比")
    String hintPercent;

    @Column(columnDefinition = "警告异常百分比")
    String warnPercent;
}
