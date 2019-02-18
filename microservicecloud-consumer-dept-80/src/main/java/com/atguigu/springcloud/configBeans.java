package com.atguigu.springcloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configBeans {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
