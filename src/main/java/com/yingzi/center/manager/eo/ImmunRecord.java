package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_foodrecord")
@Comment("饲养记录")
public class ImmunRecord {

    @Column(columnDefinition = "免疫项目")
    String immunItem;
    @Column(columnDefinition = "免疫日期")
    Date immunTime;
    @Column(columnDefinition = "免疫数量")
    Integer immunNum;
    @Column(columnDefinition = "疫苗")
    String vaccin;
    @Column(columnDefinition = "疫苗数量")
    Integer vaccinNum;

}
