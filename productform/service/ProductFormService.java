package com.xworkz.productform.service;

import com.xworkz.productform.dto.ProductFormDTO;

public interface ProductFormService {
    boolean validateAndSave(ProductFormDTO dto);
}
