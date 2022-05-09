package com.example.demo.controller;

import com.example.demo.pojo.Business;
import com.example.demo.service.BusinessService;
import com.example.demo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    /*
    查询所有商家信息
     */

    @RequestMapping("/list")
    @ResponseBody
    public List<Business> businessList(){
        return businessService.getBusinessList();
    }

    /*添加顾客*/
    @PostMapping("/add")
    @ResponseBody
    public ResultVo add(@RequestBody Business business){
        businessService.add(business);
        return  ResultVo.ok();
    }
    /*批量删除*/
    @PostMapping("/delete")
    @ResponseBody
    public ResultVo delete(@RequestBody Integer[] ids){
        businessService.deleteBatch(ids);
        return ResultVo.ok();
    }
}
