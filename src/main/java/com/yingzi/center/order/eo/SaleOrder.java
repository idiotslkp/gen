package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_sale_order")
@Comment("销售单")
public class SaleOrder {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "销售日期")
    Date saleTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;

    @Column(columnDefinition = "销售安排")
    String saleArrange;

    @Column(columnDefinition = "客户名称")
    String costomer;
    @Column(columnDefinition = "榜单")
    String poundCode;

    @Column(columnDefinition = "车牌号")
    String plate;
    @Column(columnDefinition = "电话")
    String phone;
    @Column(columnDefinition = "发货地点")
    String beginPlcce;
    @Column(columnDefinition = "目的地点")
    String endPlcce;
    @Column(columnDefinition = "运输距离")
    String km;

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "销售品种")
    private String feedType;

    @Column(columnDefinition = "品系")
    private String strain;
    @Column(columnDefinition = "数量")
    Integer saleNum;

    @Column(columnDefinition = "毛重")
    String sumWeight;

    @Column(columnDefinition = "皮重")
    String subWeight;
    @Column(columnDefinition = "净重")
    String weight;
    // todo 从折扣单里面算出来.
    @Column(columnDefinition = "可兑现折扣")
    String enableDiscount;

    @Column(columnDefinition = "应收金额")
    String price;
    @Column(columnDefinition = "折扣金额")
    String discountPrice;
    @Column(columnDefinition = "总金额")
    String sumPrice;

    @Column(columnDefinition = "实际金额")
    String realPrice;
    @Column(columnDefinition = "收款方式")
    String payStatus;

    @Column(columnDefinition = "备注")
    String remark;

    @Column(columnDefinition = "0.未提交,1.已提交")
    Integer auditStatus;

    @Column(columnDefinition = "已生成应收单,0.否,1.是")
    Integer received;
    @Column(columnDefinition = "已生成回收单,0.否,1.是")
    Integer recyling;

}
