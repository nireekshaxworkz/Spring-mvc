package com.xworkz.formapp.service;

import com.xworkz.formapp.dto.ScholarShipDTO;
import org.springframework.stereotype.Service;

@Service
public interface ScholarShipService {
    boolean validateAndSave(ScholarShipDTO dto);
}
