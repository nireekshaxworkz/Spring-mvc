package com.xworkz.formapp.controller;

import com.xworkz.formapp.dto.HotelRoomDTO;
import com.xworkz.formapp.impl.HotelRoomServiceImpl;
import com.xworkz.formapp.service.HotelRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class HotelRoom{
    @Autowired
private HotelRoomService hotelRoomService;
    public HotelRoom() {
        System.out.println("running hotelRoom component");
    }

    @RequestMapping("/book")
    public String onBook(HotelRoomDTO dto){
        System.out.println("onBooking hotelRoom");
        this.hotelRoomService.validateAndSave(dto);
        return "HotelRoom.jsp";
    }
}
