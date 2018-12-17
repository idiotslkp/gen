package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_examine")
@Comment("猪场检查")
public class Examine {

    @Column(columnDefinition = "编码")
    String code;

    @Column(columnDefinition = "检查日期")
    Date examineTime;
    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;
    @Column(columnDefinition = "批次")
    private String battch;
    @Column(columnDefinition = "技术员")
    private String technician;

    @Column(columnDefinition = "备注")
    String remark;

}
