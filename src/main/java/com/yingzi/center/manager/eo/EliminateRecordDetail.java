package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_eliminaterecord")
@Comment("死淘记录详细")
public class EliminateRecordDetail {

    @Column(columnDefinition = "死淘id")
    Long eliminateRecordId;

    @Column(columnDefinition = "死淘日期")
    Date eliminateTime;

    @Column(columnDefinition = "天龄")
    private Integer feedDays;

    @Column(columnDefinition = "病症")
    String disease;

    @Column(columnDefinition = "死淘数量")
    Integer eliminateNum;

    @Column(columnDefinition = "均重")
    String avgWeight;

    @Column(columnDefinition = "处置说明")
    String remark;

    @Column(columnDefinition = "附件id")
    String fileId;
}
