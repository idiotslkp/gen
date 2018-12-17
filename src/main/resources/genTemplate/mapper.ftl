package ${packageName}.mapper;

import com.dtyunxi.huieryun.ds.BaseMapper;
import ${packageName}.eo.${table.modelName}Eo;
import ${packageName}.dto.${table.modelName}Dto;

import com.dtyunxi.huieryun.ds.SqlTemplate;
import java.util.List;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

/**
 * @since ${.now?string("yyyy-MM-dd")}
 * @author ${author}
 */
@Repository
public interface ${table.modelName}Mapper extends BaseMapper<${table.modelName}Eo> <#noparse>{</#noparse>

	@SelectProvider(
            type = SqlTemplate.class,
            method = "findList"
    )
    List<${table.modelName}Dto> pageQuery(${table.modelName}Eo ${table.modelName?uncap_first}Eo);

<#noparse>}</#noparse>