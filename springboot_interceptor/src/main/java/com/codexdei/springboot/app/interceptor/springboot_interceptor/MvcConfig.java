package com.codexdei.springboot.app.interceptor.springboot_interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements WebMvcConfigurer{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // TODO Auto-generated method stub
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    



}
