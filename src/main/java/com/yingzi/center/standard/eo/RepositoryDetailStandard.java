package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_repositorysdetail")
@Comment("仓库设置详细")
public class RepositoryDetailStandard {

    @Column(columnDefinition = "仓库设置id")
    Long repositorysId;
    @Column(columnDefinition = "物料组")
    private String materielGroup;
    @Column(columnDefinition = "物料")
    private String materiel;
    @Column(columnDefinition = "默认仓库")
    String repository;

}
