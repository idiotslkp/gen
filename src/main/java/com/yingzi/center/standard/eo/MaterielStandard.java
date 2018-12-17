package com.yingzi.center.standard.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "standard_materiel_standard")
@Comment("物料分类设置")
public class MaterielStandard {

    @Column(columnDefinition = "对应的平台id")
    Long yingziId;

    @Column(columnDefinition = "物料编码")
    String code;

    @Column(columnDefinition = "物料名称")
    String name;

    @Column(columnDefinition = "结算分类")
    String materielStatus;

    @Column(columnDefinition = "规格")
    String standard;

}
