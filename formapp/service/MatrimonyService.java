package com.xworkz.formapp.service;

import com.xworkz.formapp.dto.MatrimonyDTO;

public interface MatrimonyService {
    boolean validateAndSave(MatrimonyDTO dto);
}
