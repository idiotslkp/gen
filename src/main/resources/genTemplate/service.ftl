package ${packageName}.service;

import com.dtyunxi.dto.ResponseDto;
import ${packageName}.eo.${table.modelName}Eo;
import ${packageName}.dto.${table.modelName}Dto;
import com.yingzi.center.common.dto.PageInfoDto;
import com.github.pagehelper.PageInfo;

/**
 * @since ${.now?string("yyyy-MM-dd")}
 * @author ${author}
 */
public interface I${table.modelName}Service <#noparse>{</#noparse>

	long insert(${table.modelName}Eo ${table.modelName?uncap_first}Eo);

    void update(${table.modelName}Eo ${table.modelName?uncap_first}Eo);

    void delete(Long id);

    ${table.modelName}Dto queryById(Long id);

    PageInfo<${table.modelName}Dto> pageQuery(PageInfoDto<${table.modelName}Dto> request);

<#noparse>}</#noparse>