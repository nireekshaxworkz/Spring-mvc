package com.xworkz.formapp.service;

import com.xworkz.formapp.dto.PassportDTO;
import org.springframework.stereotype.Service;

@Service
public interface PassportService {
    boolean validateAndSave(PassportDTO dto);
}
