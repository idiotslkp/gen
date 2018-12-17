package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_pullfeedstandard")
@Comment("领料规则设置")
public class PullStandard {

    @Column(columnDefinition = "饲养品种")
    private String feedType;
    @Column(columnDefinition = "品系")
    private String strain;
    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "生效日期")
    private Date effectTime;
    @Column(columnDefinition = "失效日期")
    private Date expiredTime;

    @Column(columnDefinition = "领料间隔天数")
    Integer pullDays;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

    @Column(columnDefinition = "类型,0.领料,1.领药")
    Integer pullType;
}
