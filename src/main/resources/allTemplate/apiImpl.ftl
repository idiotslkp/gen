package ${paramMap.packageName}.service;

import java.util.List;
import java.util.Map;

import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minstone.gx.common.utils.StringUtil;
import com.minstone.gx.common.utils.ValidatorParamUtil;
import ${paramMap.packageName}.model.${table.modelName};
import ${paramMap.packageName}.api.I${table.modelName}Api;
import ${paramMap.packageName}.service.I${table.modelName}Service;

/**
 * ${table.comment}事务层
 * 
 * @copyright 广州明动软件股份有限公司 Copyright (c) ${.now?string("yyyy")}  
 * @since ${.now?string("yyyy-MM-dd")} 
 * @author ${paramMap.author}
 * @version 1.0
 * 
 */
@Service("${table.modelName?uncap_first}Api")
public class ${table.modelName}ApiImpl implements I${table.modelName}Api <#noparse>{</#noparse>

	
	@Autowired
	private I${table.modelName}Service ${table.modelName?uncap_first}Service;

	@Autowired
	private Validator validator;
	
	@Override
	public List<${table.modelName}> getList(${table.modelName} ${table.modelName?uncap_first}) <#noparse>{</#noparse>
		return ${table.modelName?uncap_first}Service.getList(${table.modelName?uncap_first});
	<#noparse>}</#noparse>

	@Override
	public ${table.modelName} get(String uuid) {
		if (StringUtil.isNullString(uuid)) {
			throw new ConstraintViolationException("uuid不能为空", null);
		<#noparse>}</#noparse>
		return ${table.modelName?uncap_first}Service.get(uuid);
	<#noparse>}</#noparse>

	@Override
	public ${table.modelName} getModel(${table.modelName} ${table.modelName?uncap_first}) <#noparse>{</#noparse>
		return ${table.modelName?uncap_first}Service.getModel(${table.modelName?uncap_first});
	<#noparse>}</#noparse>

	@Override
	public Map<String, Object> getPage(${table.modelName} ${table.modelName?uncap_first}, int pageIndex, int pageSize) <#noparse>{</#noparse>
		return ${table.modelName?uncap_first}Service.getPage(${table.modelName?uncap_first}, pageIndex, pageSize);
	<#noparse>}</#noparse>

	@Override
	public int save(${table.modelName} ${table.modelName?uncap_first}) <#noparse>{</#noparse>
		return ${table.modelName?uncap_first}Service.save(${table.modelName?uncap_first});
	<#noparse>}</#noparse>

	@Override
	public int update(${table.modelName} ${table.modelName?uncap_first}) <#noparse>{</#noparse>
		ValidatorParamUtil.entityValidator(${table.modelName?uncap_first}, validator, "uuid");
		return ${table.modelName?uncap_first}Service.update(${table.modelName?uncap_first});
	<#noparse>}</#noparse>
	
<#noparse>}</#noparse>