package ${packageName}.apiimpl;

import ${packageName}.api.I${table.modelName}Api;
import ${packageName}.service.I${table.modelName}Service;

import ${packageName}.eo.${table.modelName}Eo;
import ${packageName}.dto.${table.modelName}Dto;
import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.common.dto.PageInfoDto;
import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("${table.modelName?uncap_first}Api")
public class ${table.modelName}ApiImpl implements I${table.modelName}Api {

    @Autowired
    private I${table.modelName}Service ${table.modelName?uncap_first}Service;

	@Override
    public ResponseDto<Long> insert(${table.modelName}Eo ${table.modelName?uncap_first}Eo) {
        long ret = ${table.modelName?uncap_first}Service.insert(${table.modelName?uncap_first}Eo);
        return new ResponseDto<Long>(ret);
    }

    @Override
    public ResponseDto<Void> update(${table.modelName}Eo ${table.modelName?uncap_first}Eo){
        ${table.modelName?uncap_first}Service.update(${table.modelName?uncap_first}Eo);
        return ResponseDto.VOID;
    }

    @Override
    public ResponseDto<Void> delete(Long id){
        ${table.modelName?uncap_first}Service.delete(id);
        return ResponseDto.VOID;
    }

    @Override
    public ${table.modelName}Dto queryById(Long id) {
        return ${table.modelName?uncap_first}Service.queryById(id);
    }

    @Override
    public PageInfo<${table.modelName}Dto> pageQuery(PageInfoDto<${table.modelName}Dto> request) {
        PageInfo<${table.modelName}Dto> pageInfo = ${table.modelName?uncap_first}Service.pageQuery(request);
        return pageInfo;
    }
	
}
