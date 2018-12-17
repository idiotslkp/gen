package com.yingzi.center.breeding.eo;


import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;
import java.lang.reflect.Field;
import java.util.Date;

/**
 * Created by user26 on 2018/4/24.
 */
@Comment("流产表")
@Table(name = "bc_female_abortion")
public class Abortion {

    // 注意,这里不需要id,
    // 默认会生成id dr(删除标识) tenant_id(租户id) create_person create_time  update_person update_time
    @Column(name = "master_org_id", columnDefinition = "主组织id")
    private Long masterOrgId;

    @Column(name = "abortiondate", columnDefinition = "流产日期")
    private Date abortionDate;

    @Column(name = "herd_id", columnDefinition = "档案id")
    private Long herdId;

//    @Column(name = "event_id", columnDefinition = "事件id")
//    private Long eventId;

    @Column(name = "deslocation", columnDefinition = "新位置")
    private String desLocation;
    // 这里演示没有数据库字段名,也能使用的demo,但是为了统一规范,注释不能少.
    @Column(columnDefinition = "备注")
    private String fcomment;

}
