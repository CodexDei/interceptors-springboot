package com.codexdei.springboot.app.interceptor.springboot_interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

    @Autowired
    @Qualifier("timeInterceptor")
    private HandlerInterceptor timeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //addPathPatterns permite excluir con que metodos del controlador se generaran los mensajes del logger en la consola o terminal
        // registry.addInterceptor(timeInterceptor).excludePathPatterns("/app/bar","/app/baz");
        //habilita todos los metodos de la ruta /app
        //registry.addInterceptor(timeInterceptor).addPathPatterns("/app/**");
        //addPathPatterns permite agregar con que metodos del controlador se generaran los mensajes del logger en la consola o terminal
        //registry.addInterceptor(timeInterceptor).excludePathPatterns("/app/bar","/app/baz");
        //addPathPatterns permite agregar con que metodos del controlador se generaran los mensajes del logger en la consola o terminal
        registry.addInterceptor(timeInterceptor).addPathPatterns("/app/bar","/app/baz");
    }

    



}
