package ${appPackageName}.${modualName}.service.impl;


import ${appPackageName}.${modualName}.service.I${table.modelName}Service;

import com.dtyunxi.dto.ResponseDto;
import ${packageName}.dto.${table.modelName}Dto;
import ${packageName}.eo.${table.modelName}Eo;
import ${packageName}.api.I${table.modelName}Api;
import com.yingzi.center.common.dto.PageInfoDto;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @since ${.now?string("yyyy-MM-dd")}
 * @author ${author}
 */
@Service("${table.modelName?uncap_first}Service")
public class ${table.modelName}ServiceImpl implements I${table.modelName}Service <#noparse>{</#noparse>

	@Autowired
	private I${table.modelName}Api ${table.modelName?uncap_first}Api;

    @Override
    public ResponseDto<Long> insert(${table.modelName}Dto ${table.modelName?uncap_first}Dto) {
        ${table.modelName}Eo ${table.modelName?uncap_first}Eo = new ${table.modelName}Eo();
        BeanUtils.copyProperties(${table.modelName?uncap_first}Dto, ${table.modelName?uncap_first}Eo);
        return ${table.modelName?uncap_first}Api.insert(${table.modelName?uncap_first}Eo);
    }

    @Override
    public ResponseDto<Void> update(${table.modelName}Dto ${table.modelName?uncap_first}Dto) {
        ${table.modelName}Eo ${table.modelName?uncap_first}Eo = new ${table.modelName}Eo();
        BeanUtils.copyProperties(${table.modelName?uncap_first}Dto, ${table.modelName?uncap_first}Eo);
        return ${table.modelName?uncap_first}Api.update(${table.modelName?uncap_first}Eo);
    }

    @Override
    public ResponseDto<Void> delete(long id) {
        return ${table.modelName?uncap_first}Api.delete(id);
    }

    @Override
    public ${table.modelName}Dto queryById(long id) {
        return ${table.modelName?uncap_first}Api.queryById(id);
    }

    @Override
    public PageInfo<${table.modelName}Dto> pageQuery(PageInfoDto<${table.modelName}Dto> request) {
        return ${table.modelName?uncap_first}Api.pageQuery(request);
    }

<#noparse>}</#noparse>