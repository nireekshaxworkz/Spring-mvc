package com.xworkz.formapp.impl;

import com.xworkz.formapp.dto.JobDTO;
import com.xworkz.formapp.service.JobService;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {

    public JobServiceImpl(){
        System.out.println("constructor of jobServiceImpl");
    }
    @Override
    public boolean validateAndSave(JobDTO dto) {
        return true;
    }
}
