package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_vaccine_record")
@Comment("免疫记录详细")
public class VaccineRecord {

    @Column(columnDefinition = "饲养记录id")
    Long foodRecordId;

    @Column(columnDefinition = "接种日期")
    Date vaccineTime;

    @Column(columnDefinition = "免疫项目")
    String vaccineItem;

    @Column(columnDefinition = "接种头数")
    Integer useNum;

    @Column(columnDefinition = "接种头份")
    Float useUnit;

    @Column(columnDefinition = "疫苗")
    String vaccine;

    @Column(columnDefinition = "批次")
    private String battch;


}
