package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_sale_contract")
@Comment("销售合同")
public class SaleContract {

    @Column(columnDefinition = "合同编号")
    String code;
    @Column(columnDefinition = "签订日期")
    Date contractTime;
    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "甲方")
    String finance;
    @Column(columnDefinition = "客户名称")
    String costomer;
    @Column(columnDefinition = "客户身份证")
    String costomerIdcard;
    @Column(columnDefinition = "客户电话")
    String costomerPhone;
    @Column(columnDefinition = "客户导致")
    String costomerAddr;
    @Column(columnDefinition = "经手人")
    String handPerson;
    @Column(columnDefinition = "合同类型,0.买卖合同,1.月度协议,2.专销年奖")
    Integer contractStatus;
    @Column(columnDefinition = "生效日期")
    private Date effectTime;
    @Column(columnDefinition = "失效日期")
    private Date expiredTime;
    @Column(columnDefinition = "备注")
    String remark;
    @Column(columnDefinition = "附件id")
    String fileId;

}
