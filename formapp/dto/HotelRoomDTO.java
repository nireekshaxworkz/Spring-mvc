package com.xworkz.formapp.dto;

public class HotelRoomDTO {
    private String fullname;
    private String email;
    private long phoneNumber;

    public HotelRoomDTO(String fullname,String email,long phoneNumber) {
        this.fullname = fullname;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "HotelRoomDTO{" +
                "fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
