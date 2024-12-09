package com.xworkz.formapp.impl;

import com.xworkz.formapp.dto.HotelRoomDTO;
import com.xworkz.formapp.service.HotelRoomService;
import org.springframework.stereotype.Service;

@Service
public class HotelRoomServiceImpl implements HotelRoomService {

    public HotelRoomServiceImpl(){
        System.out.println("no agr constructor");
    }
    @Override
    public boolean validateAndSave(HotelRoomDTO dto) {
        return true;
    }
}
