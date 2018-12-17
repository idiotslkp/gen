CREATE TABLE `${table.tableName}` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tenant_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '租户ID',
  `dr` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除标识',
  `create_person` varchar(50) NOT NULL DEFAULT '' COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_person` varchar(50) NOT NULL DEFAULT '' COMMENT '更新人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  <#list table.columnList as column>
  <#if column.type == "datetime">
  `${column.sqlName}` ${column.type}  DEFAULT NULL COMMENT '${column.comment}',
  <#else>
  `${column.sqlName}` ${column.type}  NOT NULL DEFAULT '${column.deafultValue}' COMMENT '${column.comment}',
  </#if>
  </#list>
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='${table.comment}';