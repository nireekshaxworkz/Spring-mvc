package com.xworkz.formapp.controller;

import com.xworkz.formapp.dto.ScholarShipDTO;
import com.xworkz.formapp.impl.ScholarShipServiceImpl;
import com.xworkz.formapp.service.ScholarShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ScholarShip {
    @Autowired
    private ScholarShipService scholarShipService;

    public ScholarShip() {
        System.out.println("running scholarShip in component");
    }
    @RequestMapping("/apply")
    public String onApply(ScholarShipDTO dto){
        System.out.println("onApply the scholarShip");
        this.scholarShipService.validateAndSave(dto);
        return "ScholarShip.jsp";
    }
}
