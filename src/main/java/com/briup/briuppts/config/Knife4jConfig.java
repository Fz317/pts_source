package com.briup.briuppts.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

//@Configuration // 添加此类之后，该类变为配置类
//@EnableSwagger2WebMvc
public class Knife4jConfig {
    //Swagger界面中显示的基本信息
    private ApiInfo apiInfo(){
        //配置基本信息
        Contact briup = new Contact("joker", "http://www.briup.com/index.php/", "cuigx@briup.com");
            return new ApiInfoBuilder()
                //标题
                .title("智慧养殖溯源管理系统")
                .description("欢迎访问接口文档")
                //基本信息
                .contact(briup)
                //版本号
                .version("1.0.0")
                //创建
                .build();
    }
    //配置Controller的包路径
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//传入要扫描的包结构
                .apis(RequestHandlerSelectors.basePackage("com.briup.briuppts.web.controller")
                ).paths(PathSelectors.any())
                .build();
    }
}
