package com.xworkz.productform.service;

import com.xworkz.productform.dto.ProductFormDTO;

public class ProductFormServiceImpl implements ProductFormService{
    @Override
    public boolean validateAndSave(ProductFormDTO dto) {
        System.out.println("running validateAndSave");
        return true;
    }
}
