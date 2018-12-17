package ${paramMap.packageName}.dal.model;

<#list table.importClassList as importClass> 
${importClass}
</#list>
import com.massestech.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 *
 */
@Data
@ApiModel   // swagger配置类注释
@Entity(name="demo")    // jpa映射数据库的表
public class ${table.modelName} extends BaseEntity <#noparse>{</#noparse>
	<#list table.columnList as column>
	<#if column.name != "id" && column.name != "createdTime" && column.name != "deleted">
	/** ${column.comment} */
    @ApiModelProperty(value = "${column.comment}")   // swagger字段注释
    @Column(columnDefinition = "TEXT")  // 用于自动建表时指定该字段类型
	private ${column.fileType} ${column.name};
	</#if>
	</#list>
	
<#noparse>}</#noparse>