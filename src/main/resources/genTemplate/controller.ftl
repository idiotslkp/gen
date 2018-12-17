package ${appPackageName}.${modualName}.ctrl;

import java.util.List;
import java.util.Map;

import ${appPackageName}.${modualName}.service.I${table.modelName}Service;
import com.dtyunxi.dto.ResponseDto;
import com.dtyunxi.rest.RestResponse;
import com.yingzi.app.common.controller.BaseController;
import ${packageName}.dto.${table.modelName}Dto;
import com.yingzi.center.common.dto.PageInfoDto;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @since ${.now?string("yyyy-MM-dd")}
 * @author ${author}
 *
 */
@Api(tags = "${table.comment}列表API")
@RestController
@RequestMapping("/${table.modelName?uncap_first}")
public class ${table.modelName}Controller extends BaseController <#noparse>{</#noparse>
	
	@Autowired
	private I${table.modelName}Service ${table.modelName?uncap_first}Service;
	
    @ApiOperation(value = "新增")
    @PostMapping
    public RestResponse add(@RequestBody ${table.modelName}Dto ${table.modelName?uncap_first}Dto) {
        ResponseDto<Long> result = ${table.modelName?uncap_first}Service.insert(${table.modelName?uncap_first}Dto);
        return success(result);
    }

    @ApiOperation(value = "更新")
    @PutMapping
    public RestResponse update(@RequestBody ${table.modelName}Dto ${table.modelName?uncap_first}Dto) {
        ResponseDto<Void> result = ${table.modelName?uncap_first}Service.update(${table.modelName?uncap_first}Dto);
        return success(result);
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("/{id}")
    public RestResponse delete(@PathVariable Long id) {
        ResponseDto<Void> result = ${table.modelName?uncap_first}Service.delete(id);
        return success(result);
    }

    @ApiOperation(value = "根据id查询")
    @GetMapping("/{id}")
    public RestResponse queryById(@PathVariable Long id) {
        ${table.modelName}Dto result = ${table.modelName?uncap_first}Service.queryById(id);
        return success(result);
    }

    @ApiOperation(value = "分页查询")
    @PostMapping("/pageQuery")
    public RestResponse pageQuery(@RequestBody PageInfoDto<${table.modelName}Dto> request) {
        PageInfo<${table.modelName}Dto> result = ${table.modelName?uncap_first}Service.pageQuery(request);
        return success(result);
    }

<#noparse>}</#noparse>