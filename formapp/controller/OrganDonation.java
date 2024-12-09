package com.xworkz.formapp.controller;

import com.xworkz.formapp.dto.OrganDonationDTO;
import com.xworkz.formapp.impl.OrganDonationServiceImpl;
import com.xworkz.formapp.service.OrganDonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OrganDonation {
    @Autowired
    private OrganDonationService organDonationService;
    public OrganDonation() {
        System.out.println("running organDonation in component");
    }

    @RequestMapping("/donate")
    public String onDonate(OrganDonationDTO organDonationDTO){
        System.out.println("onDonating organ");
        this.organDonationService.validateAndSave(organDonationDTO);
        return "OrganDonation.jsp";
    }
}
