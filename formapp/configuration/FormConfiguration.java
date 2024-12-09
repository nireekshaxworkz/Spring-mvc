package com.xworkz.formapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.formapp")
@EnableWebMvc
public class FormConfiguration {

    public FormConfiguration() {
        System.out.println("running no arg constructor");
    }
}
