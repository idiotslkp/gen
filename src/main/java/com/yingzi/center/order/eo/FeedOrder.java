package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_feed_order")
@Comment("领料单")
public class FeedOrder {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "领料日期")
    Date feedTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;
    @Column(columnDefinition = "批次")
    private String battch;
    @Column(columnDefinition = "天龄")
    private Integer feedDays;
    @Column(columnDefinition = "饲养品种")
    private String feedType;
    @Column(columnDefinition = "品系")
    private String strain;
    @Column(columnDefinition = "领苗日期")
    Date seedTime;
    @Column(columnDefinition = "存栏数量")
    Integer existNum;
    @Column(columnDefinition = "出库单id")
    Long outOrderId;
    @Column(columnDefinition = "是否出库,0.否,1.是")
    Integer outStatus;
    @Column(columnDefinition = "业务类型,0.领料单,1.退料单,2.转料单")
    Integer orderStauts;
    @Column(columnDefinition = "转出领料单")
    String outOrder;
    @Column(columnDefinition = "合计金额")
    Float sumPrice;
    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "累计领料数量")
    Float sumFeedNum;
    @Column(columnDefinition = "累计领料金额")
    Float sumFeedPrice;
    @Column(columnDefinition = "累计领药金额")
    Float sumDrugPrice;
    @Column(columnDefinition = "头均领料重量")
    String avgFeedWeight;
    @Column(columnDefinition = "头均领料金额")
    Float avgFeedPrice;
    @Column(columnDefinition = "头巾领药金额")
    Float avgDrugPrice;
    @Column(columnDefinition = "领料异常信息")
    String unusalMsg;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

}
