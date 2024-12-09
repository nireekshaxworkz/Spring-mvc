package com.xworkz.formapp.controller;

import com.xworkz.formapp.dto.MatrimonyDTO;
import com.xworkz.formapp.impl.MatrimonyServiceImpl;
import com.xworkz.formapp.service.MatrimonyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Matrimony {
    @Autowired
    private MatrimonyService matrimonyService;
    public Matrimony() {
        System.out.println("running matrimony component");
    }
    @RequestMapping("/matrimony")
    public String onSearch(MatrimonyDTO dto){
        System.out.println("onSearching matrimony");
        this.matrimonyService.validateAndSave(dto);
        return "Matrimony.jsp";
    }
}
