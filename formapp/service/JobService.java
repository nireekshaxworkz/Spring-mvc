package com.xworkz.formapp.service;

import com.xworkz.formapp.dto.JobDTO;

public interface JobService {
    boolean validateAndSave(JobDTO dto);
}
