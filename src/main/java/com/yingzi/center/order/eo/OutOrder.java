package com.yingzi.center.order.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

// todo 这块后续应该重新想象如何做,直接这么定义貌似不可取.
@Table(name = "order_outorder")
@Comment("领料出库单")
public class OutOrder {

    @Column(columnDefinition = "单号")
    String code;

    @Column(columnDefinition = "执行日期")
    Date execTime;

    @Column(columnDefinition = "管控组织")
    String ctrlDepartmentOrg;
    @Column(columnDefinition = "管控区")
    private String ctrlArea;
    @Column(columnDefinition = "仓库")
    String repository;

    @Column(columnDefinition = "查询条件:领料时间开始")
    Date beginFeedTime;
    @Column(columnDefinition = "查询条件:领料时间结束")
    Date endFeedTime;

    @Column(columnDefinition = "执行状态,0.执行中,1.完成")
    Integer execStstus;
    @Column(columnDefinition = "运行开始时间")
    Date beginExecTime;
    @Column(columnDefinition = "运行结束时间")
    Date endExecTime;
    @Column(columnDefinition = "单据数量")
    Integer orderNum;
    @Column(columnDefinition = "成功数量")
    Integer successNum;
    @Column(columnDefinition = "失败数量")
    Integer failNum;
    @Column(columnDefinition = "异常信息")
    String unusalMsg;
}
