package com.xworkz.formapp.impl;

import com.xworkz.formapp.dto.MatrimonyDTO;
import com.xworkz.formapp.service.MatrimonyService;
import org.springframework.stereotype.Service;

@Service
public class MatrimonyServiceImpl implements MatrimonyService {

    public MatrimonyServiceImpl(){
        System.out.println("MatrimonyServiceImpl constructor");
    }
    @Override
    public boolean validateAndSave(MatrimonyDTO dto) {
        return true;
    }
}
