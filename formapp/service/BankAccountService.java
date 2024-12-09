package com.xworkz.formapp.service;

import com.xworkz.formapp.dto.BankAccountDTO;
import org.springframework.stereotype.Service;

@Service
public interface BankAccountService {
    boolean validateAndSave(BankAccountDTO dto);
}
