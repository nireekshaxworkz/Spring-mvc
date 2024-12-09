package com.xworkz.formapp.controller;

import com.xworkz.formapp.dto.JobDTO;
import com.xworkz.formapp.impl.JobServiceImpl;
import com.xworkz.formapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Job {
    @Autowired
    private JobService jobService;
    public Job() {
        System.out.println("running job in component");
    }
    @RequestMapping("/job")
    public String onSearch(JobDTO dto){
        System.out.println("onSearching the job");
        this.jobService.validateAndSave(dto);
        return "Job.jsp";
    }
}
