package ${packageName}.eo;

<#list table.importClassList as importClass>
${importClass}
</#list>

import com.dtyunxi.eo.BaseEo;
import javax.persistence.Column;
import javax.persistence.Table;
import lombok.Data;

/**
* ${table.comment}
*/
@Data
@Table(name = "${table.tableName}")
public class ${table.modelName}Eo extends BaseEo <#noparse>{</#noparse>

    <#list table.columnList as column>
    /** ${column.comment} */
    @Column(name = "${column.sqlName}")
    private ${column.fileType} ${column.name};
    </#list>

<#noparse>}</#noparse>