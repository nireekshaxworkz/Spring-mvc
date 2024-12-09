package com.xworkz.formapp.impl;

import com.xworkz.formapp.dto.ScholarShipDTO;
import com.xworkz.formapp.service.ScholarShipService;
import org.springframework.stereotype.Service;

@Service
public class ScholarShipServiceImpl implements ScholarShipService {

    public ScholarShipServiceImpl(){
        System.out.println("scholarshipServiceImpl constructor");
    }
    @Override
    public boolean validateAndSave(ScholarShipDTO dto) {
        return true;
    }
}
