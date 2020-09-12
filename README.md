## springboot_swagger
基于Springboot 的使用swagger构建服务对外接口文档
- springboot 版本为2.3.3.RELEASE
- swagger 版本为 2.8.0
- swagger-ui: 使用前端ui为bootstrap  1.8.5
(maven 仓库com.github.xiaoymin)

#### 配置swagger 信息
```java
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2) //swagger版本
                .apiInfo(apiInfo()).select()
                //自行修改为自己的包路径
                .apis(RequestHandlerSelectors.basePackage("com.itmayiedu.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("apidoc").description("restful 风格接口")
                .termsOfServiceUrl("http://blog.csdn.net/forezp")
                .version("1.0")
                //.contact(new Contact("xxx","url","email");
                .build();
    }
}
```
#### 配置对外接口API描述和获取方法
```java
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
}
```


