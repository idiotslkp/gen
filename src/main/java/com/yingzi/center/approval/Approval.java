package com.yingzi.center.approval;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Comment("OA审批")
@Table(name = "oa_approval")
public class Approval {

    @Column(columnDefinition = "模块名(bean名称)")
    String beanName;
    @Column(columnDefinition = "推送数据id")
    Long dataId;
    @Column(columnDefinition = "是否审批完成,0.否,1.是")
    Integer approvalStatus;


//    @Column(columnDefinition = "")
//    String xxx;


}
