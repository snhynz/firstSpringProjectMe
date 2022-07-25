package com.example.firstSpringProjectMe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages ="com.example.firstSpringProjectMe" )
@Configuration
public class Config {

    @Bean
    public District getDistrict(){
        return new District("Çankaya","54651651861651");
    }
}
