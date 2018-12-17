package ${paramMap.packageName}.service.impl;

import org.springframework.stereotype.Service;

import com.minstone.gx.common.web.service.impl.BaseServiceImpl;
import ${paramMap.packageName}.dao.${table.modelName}Dao;
import ${paramMap.packageName}.model.${table.modelName};
import ${paramMap.packageName}.service.I${table.modelName}Service;
/**
 * ${table.comment}事务层
 * 
 * @copyright 广州明动软件有限公司 Copyright (c) ${.now?string("yyyy")}  
 * @since ${.now?string("yyyy-MM-dd")} 
 * @author ${paramMap.author}
 * @version 1.0
 * 
 */
@Service("${table.modelName?uncap_first}Service")
public class ${table.modelName}ServiceImpl extends 
		BaseServiceImpl<${table.modelName}Dao, ${table.modelName}> implements I${table.modelName}Service <#noparse>{</#noparse>
	
<#noparse>}</#noparse>