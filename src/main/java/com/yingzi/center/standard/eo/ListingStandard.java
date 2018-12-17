package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "standard_listing_standard")
@Comment("上市标准设置")
public class ListingStandard {

    @Column(columnDefinition = "生效日期")
    private Date effectTime;
    @Column(columnDefinition = "失效日期")
    private Date expiredTime;
    @Column(columnDefinition = "管控组织")
    private String ctrlDepartmentOrg;
    @Column(columnDefinition = "备注")
    String remark;
    @Column(columnDefinition = "饲养品种")
    private String feedType;
    @Column(columnDefinition = "销售品种")
    private String saleType;
    @Column(columnDefinition = "上市日龄")
    private Integer feedDays;
    @Column(columnDefinition = "标准上市重")
    Integer listingWeight;
    @Column(columnDefinition = "标准上市率")
    Float listingPercent;

}
