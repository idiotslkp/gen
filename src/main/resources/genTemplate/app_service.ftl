package ${appPackageName}.${modualName}.service;

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

    ResponseDto<Long> insert(${table.modelName}Dto ${table.modelName?uncap_first}Dto);

    ResponseDto<Void> update(${table.modelName}Dto ${table.modelName?uncap_first}Dto);

    ResponseDto<Void> delete(long id);

    ${table.modelName}Dto queryById(long id);

    PageInfo<${table.modelName}Dto> pageQuery(PageInfoDto<${table.modelName}Dto> request);

<#noparse>}</#noparse>