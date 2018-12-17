package com.yingzi.center.manager.eo;

import javax.persistence.Column;
import javax.persistence.Comment;
import javax.persistence.Table;

@Table(name = "manager_sale_contract_detail")
@Comment("销售合同详细")
public class SaleContractDetail {

    @Column(columnDefinition = "销售合同id")
    Long saleContractId;

    @Column(columnDefinition = "合同项名称")
    String itemName;

    @Column(columnDefinition = "值")
    String itemValue;

}
