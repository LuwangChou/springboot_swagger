package com.itmayiedu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/9/12.
 */
@RestController
@RequestMapping("/getdemo")
@Api(value = "/getdemo", tags={"测试模板2222"}, description = "获取模板2222")
public class Demo2Controller {
    private static final Logger logger = LoggerFactory.getLogger(SwaggerDemoController.class);
    @ApiOperation(value = "获取模板2222",notes="获取模板2222")
    @ApiImplicitParam(name = "demo", value ="模板id",paramType = "path",required = true, dataType="Integer")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String getStudent(@PathVariable int id){
        logger.info("开始查询某个模板222");
        return "success";
    }
}
