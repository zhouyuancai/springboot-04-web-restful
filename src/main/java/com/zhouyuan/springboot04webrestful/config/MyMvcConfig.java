package com.zhouyuan.springboot04webrestful.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zhouyuan
 * @data 2019/6/17-3:31
 */
//使用WebMvcConfigurerAdapter 可以用来拓展springMvc的功能;


@Configuration
public class MyMvcConfig  extends WebMvcConfigurerAdapter  {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("zhouyuan").setViewName("success");
    }


    @Bean  //将组件注册到容器中
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
            WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
                @Override
                public void addViewControllers(ViewControllerRegistry registry) {
                         registry.addViewController("/").setViewName("index");
                         registry.addViewController("/index.html").setViewName("login");
                }
            };
              return  adapter;
    }
}
