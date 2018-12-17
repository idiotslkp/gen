package com.yingzi.center.plan.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "plan_feed_apply_detail")
@Comment("领料申请详细")
public class FeedApplyDetail {

    @Column(columnDefinition = "领料申请id")
    String feedApply;
    @Column(columnDefinition = "物料编码")
    String code;
    @Column(columnDefinition = "物料名称")
    String name;
    @Column(columnDefinition = "规格")
    String standard;
    @Column(columnDefinition = "计量单位")
    private String measure;

    @Column(columnDefinition = "数量")
    Float countNum;

}
