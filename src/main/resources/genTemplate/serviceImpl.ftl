package ${packageName}.service.impl;


import ${packageName}.mapper.${table.modelName}Mapper;
import ${packageName}.eo.${table.modelName}Eo;
import ${packageName}.dto.${table.modelName}Dto;
import ${packageName}.service.I${table.modelName}Service;
import com.yingzi.center.common.dto.PageInfoDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.common.service.ServiceUtils;
import com.yingzi.center.common.service.SqlFilterHelper;
import java.util.List;

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
	private ${table.modelName}Mapper ${table.modelName?uncap_first}Mapper;

    @Override
    public long insert(${table.modelName}Eo ${table.modelName?uncap_first}Eo) {
        long ret = ${table.modelName?uncap_first}Mapper.insert(${table.modelName?uncap_first}Eo);
        return ret;
    }

    @Override
    public void update(${table.modelName}Eo ${table.modelName?uncap_first}Eo) {
        ${table.modelName?uncap_first}Mapper.updateSelective(${table.modelName?uncap_first}Eo);
    }

    @Override
    public void delete(Long id) {
        ${table.modelName?uncap_first}Mapper.deleteLogicById(${table.modelName}Eo.class, id, true);
    }

    @Override
    public ${table.modelName}Dto queryById(Long id) {
        ${table.modelName}Eo ${table.modelName?uncap_first}Eo = ${table.modelName?uncap_first}Mapper.findById(${table.modelName}Eo.class, id);
        ${table.modelName}Dto ${table.modelName?uncap_first}Dto = new ${table.modelName}Dto();
        if(${table.modelName?uncap_first}Eo != null) {
            BeanUtils.copyProperties(${table.modelName?uncap_first}Eo, ${table.modelName?uncap_first}Dto);
        }
        return ${table.modelName?uncap_first}Dto;
    }

    @Override
    public PageInfo<${table.modelName}Dto> pageQuery(PageInfoDto<${table.modelName}Dto> request) {
        ServiceUtils.startPage(request);
        ${table.modelName}Eo ${table.modelName?uncap_first}Eo = new ${table.modelName}Eo();
        BeanUtils.copyProperties(request.getParam(), ${table.modelName?uncap_first}Eo);

        List<${table.modelName}Dto> list = ${table.modelName?uncap_first}Mapper.pageQuery(${table.modelName?uncap_first}Eo);
        PageInfo<${table.modelName}Dto> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

<#noparse>}</#noparse>