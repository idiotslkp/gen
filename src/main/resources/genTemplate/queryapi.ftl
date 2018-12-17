package ${packageName}.api;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.PageInfoDto;
import ${packageName}.dto.${table.modelName}Dto;


/**
 * @since ${.now?string("yyyy-MM-dd")}
 * @author ${author}
 */
public interface I${table.modelName}QueryApi {

	 public long insert(${table.modelName}Eo ${table.modelName?uncap_first}Eo);

     public PageInfo<${table.modelName}Dto> pageQuery(PageInfoDto<${table.modelName}Dto> request);

     public int update(${table.modelName}Eo ${table.modelName?uncap_first}Eo);

     public int delete(${table.modelName}Dto ${table.modelName?uncap_first}Dto);
	
}
