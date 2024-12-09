package com.xworkz.formapp.service;

import com.xworkz.formapp.dto.HospitalDTO;
import org.springframework.stereotype.Service;

@Service
public interface HospitalService {
    boolean validateAndSave(HospitalDTO dto);
}
