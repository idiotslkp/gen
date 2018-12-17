package ${paramMap.packageName}.api;

import java.util.List;
import java.util.Map;

import ${paramMap.packageName}.model.${table.modelName};

/**
 * ${table.comment}服务接口
 * 
 * @copyright 广州明动软件股份有限公司 Copyright (c) ${.now?string("yyyy")}  
 * @since ${.now?string("yyyy-MM-dd")} 
 * @author ${paramMap.author}
 * @version 1.0
 * 
 */
public interface I${table.modelName}Api {
	/**
	 * 获取${table.comment}列表
	 * @param producUnitDoc
	 * @return
	 */
	List<${table.modelName}> getList(${table.modelName} ${table.modelName?uncap_first});
	/**
	 * 根据id获取${table.comment}
	 */
	${table.modelName} get(String uuid);
	/**
	 * 保存
	 */
	int save(${table.modelName} ${table.modelName?uncap_first});
	/**
	 * 更新
	 */
	int update(${table.modelName} ${table.modelName?uncap_first});
	/**
	 * 按条件查询
	 */
	${table.modelName} getModel(${table.modelName} ${table.modelName?uncap_first});
	/**
	 * 分页查询
	 * @param ${table.modelName?uncap_first} 查询参数
	 * @param pageIndex 页数
	 * @param pageSize  行数
	 * @return 返回map,其中rows是list列表,total是数据总条数
	 */
	Map<String, Object> getPage(${table.modelName} ${table.modelName?uncap_first}, int pageIndex, int pageSize);
	
}
