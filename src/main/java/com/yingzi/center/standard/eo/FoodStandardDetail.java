package com.yingzi.center.standard.eo;


import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_foodstandard")
@Comment("采食标准设置")
public class FoodStandardDetail {

    @Column(columnDefinition = "采食标准id")
    Long foodStandardId;
    @Column(columnDefinition = "天龄")
    private Integer feedDays;
    @Column(columnDefinition = "标准采食量")
    String foodStandard;

}
