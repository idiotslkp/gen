package ${packageName}.dto;

<#list table.importClassList as importClass>
${importClass}
</#list>

import com.dtyunxi.vo.BaseVo;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Data
@ApiModel("${table.comment}")
public class ${table.modelName}Dto extends BaseVo <#noparse>{</#noparse>

    @ApiModelProperty(value = "id")
    private Long id;
    <#list table.columnList as column>
    @ApiModelProperty(value = "${column.comment}")
    private ${column.fileType} ${column.name};
    </#list>

<#noparse>}</#noparse>