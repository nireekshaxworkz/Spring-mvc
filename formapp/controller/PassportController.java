package com.xworkz.formapp.controller;

import com.xworkz.formapp.dto.PassportDTO;
import com.xworkz.formapp.impl.PassPortServiceImpl;
import com.xworkz.formapp.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassportController {
    @Autowired
    private PassportService passportService;
    public PassportController(){
        System.out.println("no agrument constructor");
    }
    @RequestMapping("/Register")
    public String onRegister(PassportDTO dto){
        System.out.println("onRegistering the passport");
          boolean ref=this.passportService.validateAndSave(dto);
          if(ref){
              System.out.println("saved");
          }else {
              System.out.println("not saved");
          }

        return "Passport.jsp";
    }
}
