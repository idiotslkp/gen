package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "plan_poundorder")
@Comment("过磅单")
public class PoundOrder {

    @Column(columnDefinition = "销售安排")
    String saleArrange;

    @Column(columnDefinition = "客户名称")
    String costomer;
    @Column(columnDefinition = "车牌号")
    String plate;
    @Column(columnDefinition = "数量")
    Integer pigNum;
    @Column(columnDefinition = "单号")
    String code;
    @Column(columnDefinition = "进磅时间")
    Date beginPoundTime;
    @Column(columnDefinition = "出磅时间")
    Date endPoundTime;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;
    @Column(columnDefinition = "进磅重")
    String beginPoundWeight;
    @Column(columnDefinition = "出磅重")
    String endPoundWeight;
    @Column(columnDefinition = "过磅地点")
    String poundPlace;
    @Column(columnDefinition = "扣重")
    String subWeight;
    @Column(columnDefinition = "净重")
    String weight;

    @Column(columnDefinition = "销售组织")
    private String ctrlDepartmentOrg;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "是否已销售,0.否,1.是")
    Integer saleStatus;

}
