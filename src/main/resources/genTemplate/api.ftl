package ${packageName}.api;

import com.dtyunxi.dto.ResponseDto;
import ${packageName}.dto.${table.modelName}Dto;
import ${packageName}.eo.${table.modelName}Eo;
import com.yingzi.center.common.dto.PageInfoDto;
import com.github.pagehelper.PageInfo;

/**
 * @since ${.now?string("yyyy-MM-dd")}
 * @author ${author}
 */
public interface I${table.modelName}Api {

    ResponseDto<Long> insert(${table.modelName}Eo ${table.modelName?uncap_first}Eo);

    ResponseDto<Void> update(${table.modelName}Eo ${table.modelName?uncap_first}Eo);

    ResponseDto<Void> delete(Long id);

    ${table.modelName}Dto queryById(Long id);

    PageInfo<${table.modelName}Dto> pageQuery(PageInfoDto<${table.modelName}Dto> request);
	
}
