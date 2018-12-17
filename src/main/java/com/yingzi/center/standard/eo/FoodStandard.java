package com.yingzi.center.standard.eo;


import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_foodstandard")
@Comment("采食标准设置")
public class FoodStandard {

    @Column(columnDefinition = "生效日期")
    private Date effectTime;
    @Column(columnDefinition = "失效日期")
    private Date expiredTime;
    @Column(columnDefinition = "管控组织")
    private String ctrlDepartmentOrg;

    @Column(columnDefinition = "饲养品种")
    private String feedType;
    @Column(columnDefinition = "品系")
    private String strain;
    @Column(columnDefinition = "备注")
    String remark;
    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;
}
