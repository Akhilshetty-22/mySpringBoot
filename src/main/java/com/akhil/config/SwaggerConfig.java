package com.akhil.config;

import jdk.jshell.SourceCodeAnalysis;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.tools.DocumentationTool;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //@Bean
//    public Docket api(){
//        return new  Docket()
//                .select()
//                .apis(RequestHandlerSelectors.basePackage())
//                .paths(pathSelectors.any)
//                .build();
//
//    }
}