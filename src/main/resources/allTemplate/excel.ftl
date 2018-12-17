<#list table.columnList as column>
<#if column.name != "isValid" && column.name != "createTime">
${column.name}:"",//${column.comment}
</#if>
</#list>
