package com.oyc.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: Hello测试控制器
 * @Author oyc
 * @Date 2020/12/1 11:26 下午
 */
@RestController
@RequestMapping("hello")
@Api("Hello测试控制器")
public class HelloController {

    @GetMapping
    @ApiOperation(value = "Hello默认方法", notes = "访问hello可以获取’Hello World‘")

    public String hello(){
        return "Hello World";
    }
}
