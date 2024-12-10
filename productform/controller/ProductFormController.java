package com.xworkz.productform.controller;

import com.xworkz.productform.dto.ProductFormDTO;
import com.xworkz.productform.service.ProductFormService;
import com.xworkz.productform.service.ProductFormServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProductFormController {
    @Autowired
    ProductFormService productFormService=new ProductFormServiceImpl();

    public ProductFormController(){
        System.out.println("created ProductFormController");
    }
   @RequestMapping("/Save")
   public String onSave(ProductFormDTO dto){
       System.out.println("onSaving the product");
       productFormService.validateAndSave(dto);
       return "Product.jsp";
   }
}
