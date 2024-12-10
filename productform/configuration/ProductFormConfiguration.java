package com.xworkz.productform.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.productform")
public class ProductFormConfiguration {

    public ProductFormConfiguration(){
        System.out.println("no argument constructor");
    }


}
