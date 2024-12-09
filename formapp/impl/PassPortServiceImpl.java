package com.xworkz.formapp.impl;

import com.xworkz.formapp.dto.PassportDTO;
import com.xworkz.formapp.service.PassportService;
import org.springframework.stereotype.Service;

@Service
public class PassPortServiceImpl implements PassportService {

    public PassPortServiceImpl(){
        System.out.println("using passportServiceImpl");
    }
    @Override
    public boolean validateAndSave(PassportDTO dto) {
        return true;
    }
}
