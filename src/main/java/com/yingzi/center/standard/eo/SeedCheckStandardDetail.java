package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_seed_check_standard_detail")
@Comment("进苗前巡查检查项")
public class SeedCheckStandardDetail {


    @Column(columnDefinition = "巡查模板id")
    Long seedCheckStandardId;
    @Column(columnDefinition = "项目编码")
    String code;

    @Column(columnDefinition = "名称")
    String name;

    @Column(columnDefinition = "标准")
    String strandard;

    @Column(columnDefinition = "附件id")
    String fileId;

    @Column(columnDefinition = "显示顺序")
    Integer orderNum;

}
