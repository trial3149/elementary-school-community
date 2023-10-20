package com.example.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/tables").setViewName("tables");
        registry.addViewController("/schedule").setViewName("schedule");
        registry.addViewController("/timetable").setViewName("timetable");
        registry.addViewController("/blank").setViewName("blank");
        registry.addViewController("/admin").setViewName("admin/admin");
        registry.addViewController("/admin/memberList").setViewName("admin/memberList");
    }
}