package com.xworkz.formapp.impl;

import com.xworkz.formapp.dto.BankAccountDTO;
import com.xworkz.formapp.service.BankAccountService;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    public BankAccountServiceImpl(){
        System.out.println("use bankAccountServiceImpl");
    }
    @Override
    public boolean validateAndSave(BankAccountDTO dto) {
        return true;
    }
}
