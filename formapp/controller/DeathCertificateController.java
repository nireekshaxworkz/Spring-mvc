package com.xworkz.formapp.controller;

import com.xworkz.formapp.dto.DeathCertificateDTO;
import com.xworkz.formapp.impl.DeathCertificateServiceImpl;
import com.xworkz.formapp.service.DeathCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DeathCertificateController {
    @Autowired
    private DeathCertificateService deathCertificateService;
    public DeathCertificateController(){
        System.out.println("no argument constructor");
    }
    @RequestMapping("/deceased")
    public String onSave(DeathCertificateDTO dto){
        System.out.println("running deathCertificateController");
        this.deathCertificateService.validateAndSave(dto);
        return "DeathCertificate.jsp";
    }
}
