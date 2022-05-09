package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket getDocket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(getApiInfo())//指定接口说明书
        .select()//指定监控那些接口
                .apis(
                        RequestHandlerSelectors.basePackage("com.example.demo.controller")
                ).paths(PathSelectors.any()) //指定文档扫描范围
                .build();
        return docket;
    }

    public ApiInfo getApiInfo(){
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("商家信息管理系统接口文档")
                .description("描述信息")
                .version("v1.0")
                .contact(
                        new Contact("liuqi", "url", "924837582.com")
                ).build();
        return apiInfo;
    }
}
