package ${paramMap.packageName}.api;

<#list table.importClassList as importClass> 
${importClass}
</#list>
import com.minstone.gx.common.model.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ${table.comment},对应的数据库表-->${table.tableName}
 * 
 * @copyright 广州明动软件有限公司 Copyright (c) ${.now?string("yyyy")}  
 * @since ${.now?string("yyyy-MM-dd")} 
 * @author ${paramMap.author}
 * @version 1.0
 * 
 */
@ApiModel(description = "${table.comment}")
public class ${table.modelName}_Api extends BaseModel <#noparse>{</#noparse>
	<#list table.columnList as column>
	<#if column.name != "id" && column.name != "isValid" && column.name != "createTime">
	@ApiModelProperty(required = true, value = "${column.comment}")
	private ${column.fileType} ${column.name};
	</#if>
	</#list>
	
	<#list table.columnList as column>
	<#if column.name != "id" && column.name != "isValid" && column.name != "createTime">
	/**
	 * 获取${column.comment}
	 */
	public ${column.fileType} get${column.name?cap_first}() <#noparse>{</#noparse>
		return ${column.name};
	<#noparse>}</#noparse>
	/**
	 * 设置${column.comment}
	 */
	public void set${column.name?cap_first}(${column.fileType} ${column.name}) <#noparse>{</#noparse>
		this.${column.name} = ${column.name};
	<#noparse>}</#noparse>
	</#if>
	</#list>
<#noparse>}</#noparse>