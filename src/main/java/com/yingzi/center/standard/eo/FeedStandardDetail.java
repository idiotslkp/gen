package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_feedstandarddetail")
@Comment("领料价格设置详细")
public class FeedStandardDetail {

    @Column(columnDefinition = "采食标准id")
    Long feedStandardId;

    @Column(columnDefinition = "物料编码")
    String code;
    @Column(columnDefinition = "物料名称")
    String name;
    @Column(columnDefinition = "计量单位")
    private String measure;

    @Column(columnDefinition = "规格")
    String standard;

    @Column(columnDefinition = "计量单温")
    String price;

    @Column(columnDefinition = "生效日期")
    private Date effectTime;
    @Column(columnDefinition = "失效日期")
    private Date expiredTime;

}
