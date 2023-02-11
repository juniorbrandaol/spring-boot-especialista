package com.eblj.curse.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean(name ="appName")
    public String appName(){
        return "Sistema de Configuração";
    }

    @Bean
    public String bdName(){
        return "Mysql";
    }
}
