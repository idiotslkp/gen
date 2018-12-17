package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_curedetail")
@Comment("保健治疗方案详细")
public class CureDetail {


    @Column(columnDefinition = "治疗id")
    Long cureId;

    @Column(columnDefinition = "病症")
    String disease;

    @Column(columnDefinition = "病症分类")
    String diseaseStatus;

    @Column(columnDefinition = "附件id")
    String fileId;

    @Column(columnDefinition = "方案")
    String cure;

}
