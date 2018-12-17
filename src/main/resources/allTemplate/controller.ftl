package ${paramMap.packageName}.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.minstone.gx.common.web.controller.BaseRespController;

import ${paramMap.packageName}.model.${table.modelName};
import ${paramMap.packageName}.api.I${table.modelName}Api;

/**
 * ${table.comment}控制层
 * 
 * @copyright 广州明动软件有限公司 Copyright (c) ${.now?string("yyyy")}  
 * @since ${.now?string("yyyy-MM-dd")} 
 * @author ${paramMap.author}
 * @version 1.0
 * 
 */
@RestController
@RequestMapping("<#noparse>${dataPath}</#noparse>/${table.modelName?uncap_first}")
public class ${table.modelName}Controller extends BaseRespController <#noparse>{</#noparse>
	
	@Autowired
	private I${table.modelName}Api ${table.modelName?uncap_first}Api;
	
	/**
	 * 获取多条
	 */
	@RequestMapping(value ="getList")  
	public Map<String, Object> getList(${table.modelName} ${table.modelName?uncap_first}) {
		List<${table.modelName}> list = ${table.modelName?uncap_first}Api.getList(${table.modelName?uncap_first});
		return respListToJson(list);
	}
	
	/**
	 * 根据id获取单条
	 */
	@RequestMapping("/getById")
	public Map<String, Object> getById(@RequestParam (value="uuid",required=false) String uuid) {
		return respJson(${table.modelName?uncap_first}Api.get(uuid));
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public Map<String, Object> save(${table.modelName} ${table.modelName?uncap_first}) {
		int result = ${table.modelName?uncap_first}Api.save(${table.modelName?uncap_first});
		return respSaveOrUpd(result);
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public Map<String, Object> update(${table.modelName} ${table.modelName?uncap_first}) {
		int result = ${table.modelName?uncap_first}Api.update(${table.modelName?uncap_first});		
		return respSaveOrUpd(result);
	}
	
	/**
	 * 获取单条数据,注意,如果获取的是多条,会出bug的哦.
	 */
	@RequestMapping("/getModel")
	public Map<String, Object> getModel(${table.modelName} ${table.modelName?uncap_first}) {
		${table.modelName?uncap_first} = ${table.modelName?uncap_first}Api.getModel(${table.modelName?uncap_first});		
		return respJson(${table.modelName?uncap_first});
	}
	
	/**
	 * 分页列表
	 */
	@RequestMapping("/getPage")
	public Map<String, Object> getPage(@RequestParam(defaultValue="1") int pageIndex,@RequestParam(defaultValue="10") int pageSize, ${table.modelName} ${table.modelName?uncap_first}) {
		Map<String, Object> map = ${table.modelName?uncap_first}Api.getPage(${table.modelName?uncap_first}, pageIndex, pageSize);
		return respPageToJson(map);
	}
	
<#noparse>}</#noparse>