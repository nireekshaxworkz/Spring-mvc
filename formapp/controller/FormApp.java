package com.xworkz.formapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@Controller
@RequestMapping("/")
public class FormApp {

    public FormApp() {
        System.out.println("running formApp in component");
    }
    @RequestMapping("/click")
    public String onClick(){
        System.out.println("running onPress in FormApp");
        return "index.jsp";
    }

}
