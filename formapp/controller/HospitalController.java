package com.xworkz.formapp.controller;

import com.xworkz.formapp.dto.HospitalDTO;
import com.xworkz.formapp.impl.HospitalServiceImpl;
import com.xworkz.formapp.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;
    public HospitalController(){
        System.out.println("using hospitalController");
    }
    @RequestMapping("/consultation")
    public String onConsultation(HospitalDTO dto){
        System.out.println("onConsulting the hospitalController");
        this.hospitalService.validateAndSave(dto);
        return "Hospital.jsp";
    }
}
