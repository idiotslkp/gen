package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "standard_pull_audit_standard_detail")
@Comment("领料审批标准设置详细")
public class PullAuditStandardDetail {

    @Column(columnDefinition = "饲养品种")
    private Long pullAuditStandardId;
    @Column(columnDefinition = "饲养品种")
    private String feedType;
    @Column(columnDefinition = "来源品种")
    String sourceType;
    @Column(columnDefinition = "计量单位")
    private String measure;
    @Column(columnDefinition = "标准数量")
    Integer standardNum;

}

