package com.xworkz.formapp.controller;

import com.xworkz.formapp.dto.BankAccountDTO;
import com.xworkz.formapp.impl.BankAccountServiceImpl;
import com.xworkz.formapp.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankAccountController {
    @Autowired
    private BankAccountService bankAccountService;
   public BankAccountController(){
       System.out.println("running bankAccountController");
   }
   @RequestMapping("/search")
    public String onSearch(BankAccountDTO dto){
       System.out.println("onSearching in bankAccountController");
       this.bankAccountService.validateAndSave(dto);
       return "BankAccount.jsp";
   }
}
