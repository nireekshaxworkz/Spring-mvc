package com.xworkz.formapp.service;

import com.xworkz.formapp.dto.HotelRoomDTO;
import org.springframework.stereotype.Service;

@Service
public interface HotelRoomService {

    boolean validateAndSave(HotelRoomDTO dto);
}
