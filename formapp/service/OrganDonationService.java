package com.xworkz.formapp.service;

import com.xworkz.formapp.dto.OrganDonationDTO;

public interface OrganDonationService {
    boolean validateAndSave(OrganDonationDTO dto);
}
