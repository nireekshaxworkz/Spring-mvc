package com.xworkz.formapp.impl;

import com.xworkz.formapp.dto.OrganDonationDTO;
import com.xworkz.formapp.service.OrganDonationService;
import org.springframework.stereotype.Service;

@Service
public class OrganDonationServiceImpl implements OrganDonationService {

    public OrganDonationServiceImpl(){
        System.out.println("organDonationServiceImpl constructor");
    }
    @Override
    public boolean validateAndSave(OrganDonationDTO dto) {
        return true;
    }
}
