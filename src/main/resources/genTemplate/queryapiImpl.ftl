package ${packageName}.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;

import ${packageName}.api.query.I${table.modelName}QueryApi;
import ${packageName}.dto.${table.modelName}Dto;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("${table.modelName?uncap_first}QueryApi")
public class I${table.modelName}QueryApiImpl implements I${table.modelName}QueryApi {

    @Autowired
    private I${table.modelName}QueryService ${table.modelName?uncap_first}QueryService;

    @Override
    public ResponseDto<PageInfo<${table.modelName}Dto>> pageQuery(PageInfoDto<${table.modelName}Dto> request) {
        PageInfo<${table.modelName}Dto> pageInfo = ${table.modelName?uncap_first}QueryService.pageQuery(request);
        return new ResponseDto<PageInfo<${table.modelName}Dto>>(pageInfo);
    }

}
