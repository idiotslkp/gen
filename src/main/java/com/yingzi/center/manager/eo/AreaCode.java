package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_area_code")
@Comment("行政区域编码")
public class AreaCode {

    @Column(columnDefinition = "编码")
    Integer code;

    @Column(columnDefinition = "父类编码")
    Integer parendCode;

    @Column(columnDefinition = "名称")
    String name;

}
