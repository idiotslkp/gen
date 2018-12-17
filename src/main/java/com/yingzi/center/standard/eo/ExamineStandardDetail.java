package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

// todo 这里需要有检查项分类
@Table(name = "manager_examinestandarddetail")
@Comment("猪场检查表设置详细")
public class ExamineStandardDetail {

    @Column(columnDefinition = "猪场检查表设置id")
    Long examineStandardId;

    @Column(columnDefinition = "分类")
    String examineStatus;
    @Column(columnDefinition = "检查项")
    String examineItem;
    @Column(columnDefinition = "检查内容")
    String examine;
    @Column(columnDefinition = "分值")
    String examineScore;
    @Column(columnDefinition = "标准")
    String standard;
    @Column(columnDefinition = "显示顺序")
    Integer orderNum;

}
