package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Deprecated // 应该用不到.
@Table(name = "manager_repositorys")
@Comment("养户仓库")
public class Repositorys {

    @Column(columnDefinition = "养户姓名")
    private String farmerName;

    @Column(columnDefinition = "养户id")
    private String farmerId;

    @Column(columnDefinition = "饲料品种")
    String feedStatus;

    @Column(columnDefinition = "饲料库存量")
    Float feedExist;


}
