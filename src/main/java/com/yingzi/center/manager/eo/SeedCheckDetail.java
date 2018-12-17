package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_seedcheckdetail")
@Comment("进苗前巡查检查项")
public class SeedCheckDetail {

    @Column(columnDefinition = "项目编码")
    String code;

    @Column(columnDefinition = "巡查id")
    Long seedCheckTplId;

    @Column(columnDefinition = "名称")
    String name;

    @Column(columnDefinition = "标准")
    String strandard;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "检查结果")
    String checkResult;

    @Column(columnDefinition = "附件id")
    String fileId;
}
