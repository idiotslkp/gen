package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "manager_sign_in")
@Comment("签到")
public class SignIn {

    @Column(columnDefinition = "签到人")
    String signPerson;
    @Column(columnDefinition = "签到人id")
    String signPersonId;
    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;
    @Column(columnDefinition = "签到开始时间")
    Date beginSingTime;
    @Column(columnDefinition = "签到结束时间")
    Date endSingTime;
    @Column(columnDefinition = "经度")
    String longitude;
    @Column(columnDefinition = "纬度")
    String latitude;
}
