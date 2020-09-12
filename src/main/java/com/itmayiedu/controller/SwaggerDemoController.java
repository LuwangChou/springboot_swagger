package com.itmayiedu.controller;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2020/9/4.
 */
@RestController
@RequestMapping("/api")
//@Api("swaggerDemoController相关的api")
@Api(value = "/api", tags={"测试"}, description = "测试接口API")
public class SwaggerDemoController {
    private static final Logger logger = LoggerFactory.getLogger(SwaggerDemoController.class);

    @ApiOperation(value = "根据id查询学生信息",notes="查询数据库中某个的学生信息")
    @ApiImplicitParam(name = "id", value ="学生id",paramType = "path",required = true, dataType="Integer")
    @RequestMapping(value = "/api1/{id}",method = RequestMethod.GET)
    public String getStudent(@PathVariable int id){
        logger.info("开始查询某个学生信息");
        return "success";
    }

    @ApiOperation(value = "根据id查询学生信息",notes="查询数据库中某个的学生信息")
    @ApiImplicitParam(name = "id", value ="学生id",paramType = "path",required = true, dataType="Integer")
    @RequestMapping(value = "/api2/{id}",method = RequestMethod.GET)
    public String getStudent2(@PathVariable int id){
        logger.info("开始查询某个学生信息");
        return "success";
    }

    @ApiOperation(value = "根据id查询学生信息",notes="查询数据库中某个的学生信息")
    @ApiImplicitParam(name = "id", value ="学生id",paramType = "path",required = true, dataType="Integer")
    @RequestMapping(value = "/api3/{id}",method = RequestMethod.GET)
    public String getStudent3(@PathVariable int id){
        logger.info("开始查询某个学生信息");
        return "success";
    }

    @ApiOperation(value = "根据id查询学生信息",notes="查询数据库中某个的学生信息")
    @ApiImplicitParam(name = "id", value ="学生id",paramType = "path",required = true, dataType="Integer")
    @RequestMapping(value = "/api4/{id}",method = RequestMethod.GET)
    public String getStudent4(@PathVariable int id){
        logger.info("开始查询某个学生信息");
        return "success";
    }

    @ApiOperation(value = "根据id查询学生信息",notes="查询数据库中某个的学生信息")
    @ApiImplicitParam(name = "id", value ="学生id",paramType = "path",required = true, dataType="Integer")
    @RequestMapping(value = "/api5/{id}",method = RequestMethod.GET)
    public String getStudent5(@PathVariable int id){
        logger.info("开始查询某个学生信息");
        return "success";
    }

}
