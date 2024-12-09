package com.xworkz.formapp.impl;

import com.xworkz.formapp.dto.HospitalDTO;
import com.xworkz.formapp.service.HospitalService;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService {

    public HospitalServiceImpl(){
        System.out.println("using hospitalServiceImpl");
    }
    @Override
    public boolean validateAndSave(HospitalDTO dto) {
        return true;
    }
}
