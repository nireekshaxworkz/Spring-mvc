package com.xworkz.formapp.service;

import com.xworkz.formapp.dto.DeathCertificateDTO;
import org.springframework.stereotype.Service;

@Service
public interface DeathCertificateService {
    boolean validateAndSave(DeathCertificateDTO dto);
}
