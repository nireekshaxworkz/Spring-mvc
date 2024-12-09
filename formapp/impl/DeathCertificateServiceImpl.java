package com.xworkz.formapp.impl;

import com.xworkz.formapp.dto.DeathCertificateDTO;
import com.xworkz.formapp.service.DeathCertificateService;
import org.springframework.stereotype.Service;

@Service
public class DeathCertificateServiceImpl implements DeathCertificateService {

    public DeathCertificateServiceImpl(){
        System.out.println("deathCertificateServiceImpl constructor");
    }
    @Override
    public boolean validateAndSave(DeathCertificateDTO dto) {
        return true;
    }
}
