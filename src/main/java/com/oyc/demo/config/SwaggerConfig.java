package com.oyc.demo.config;

import org.springframework.beans.factory.annotation.Value;
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

/**
 * Swagger2的接口配置
 *
 * @author ruoyi
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 创建API
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                // 详细定制
                .apiInfo(apiInfo())
                .select()
                // 指定当前包路径
                //.apis(RequestHandlerSelectors.basePackage("com.oyc.demo.controller"))
                // 扫描所有
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 添加摘要信息
     */
    private ApiInfo apiInfo() {
        // 用ApiInfoBuilder进行定制
        return new ApiInfoBuilder()
                .title("标题：接口文档")
                .description("描述：管理接口、接口测试功能")
                .contact(new Contact("oyc", "https://blog.csdn.net/u014553029?spm=1000.2115.3001.5113", null))
                .version("版本号: V1.0.1")
                .build();
    }
}
