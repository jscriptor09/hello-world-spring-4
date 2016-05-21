package com.rel.ge.Config;

import com.rel.ge.Services.HelloWorldService;
import com.rel.ge.Services.HelloWorldServiceEnglishImpl;
import com.rel.ge.Services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Mark on 2/6/2016.
 */
@Configuration
public class HelloConfig {

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish() {
        return new HelloWorldServiceSpanishImpl();
    }
}
