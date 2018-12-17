package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_place")
@Comment("地区")
public class Place {

    @Column(columnDefinition = "外部id")
    Long foreignId;
    @Column(columnDefinition = "详细地点")
    private String detailPlace;
    @Column(columnDefinition = "区域编码")
    private String areaCode;
    @Column(columnDefinition = "区域编码,以,隔开")
    private String areaCodes;

}
