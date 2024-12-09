package com.xworkz.formapp.dto;

public class ScholarShipDTO {
    private String fullName;
    private String email;
    private String homeAddress;
    private int idNumber;
    private long phoneNumber;

    public ScholarShipDTO(String fullName,String email,String homeAddress,int idNumber,long phoneNumber) {
        this.fullName = fullName;
        this.email=email;
        this.homeAddress=homeAddress;
        this.idNumber=idNumber;
        this.phoneNumber=phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ScholarShipDTO{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", idNumber=" + idNumber +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
