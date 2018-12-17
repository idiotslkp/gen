package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_examinedetail")
@Comment("猪场检查")
public class ExamineDetail {

    @Column(columnDefinition = "猪场检查id")
    Long examineStandardId;

    @Column(columnDefinition = "分类")
    String examineStatus;
    @Column(columnDefinition = "检查项")
    String examineItem;
    @Column(columnDefinition = "检查内容")
    String examine;

    @Column(columnDefinition = "检查结果")
    String examineResult;

    @Column(columnDefinition = "附件id")
    String fileId;

    @Column(columnDefinition = "分值")
    String examineScore;
    @Column(columnDefinition = "标准")
    String standard;
}
