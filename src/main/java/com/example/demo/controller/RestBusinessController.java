package com.example.demo.controller;

import com.example.demo.pojo.Business;
import com.example.demo.service.BusinessService;
import com.example.demo.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*Restful接口风格*/
@RestController
@RequestMapping("/business1")
@Api(tags = "商家信息管理接口")
public class RestBusinessController {

    @Autowired
    private BusinessService businessService;

    /*查询*/
    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询商户信息",notes = "无注意事项")
    @ApiImplicitParam(example = "4",paramType = "path",name = "id",value = "要查询的商户id"
    ,required = true,dataType = "int")
    public ResultVo getBusiness(@PathVariable("id")Integer id){
        Business business = businessService.getBusinessById(id);
        return ResultVo.ok(business);
    }
    /*删除*/
    @DeleteMapping("/{id}")
    @ApiOperation(value = "根据id删除商户信息",notes = "无注意事项")
    @ApiImplicitParam(example = "4",paramType = "path",name = "id",value = "要删除的商户id"
    ,required = true,dataType = "int")
    public ResultVo deleteBusiness(@PathVariable("id")Integer id){
        businessService.deleteBusinessById(id);
        return ResultVo.ok();
    }
    /*增加*/
    @PostMapping()
    @ApiOperation(value = "添加商户信息",notes = "无注意事项")
    public ResultVo addBusiness(@RequestBody Business business){
        businessService.add(business);
        return ResultVo.ok();
    }
    /*更新*/
    @PutMapping()
    @ApiOperation(value = "修改商户信息",notes = "传入数据必须有id")
    public ResultVo updateBusiness(@RequestBody Business business){
        businessService.update(business);
        return ResultVo.ok();
    }
}
