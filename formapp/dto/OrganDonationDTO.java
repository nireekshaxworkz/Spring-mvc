package com.xworkz.formapp.dto;

public class OrganDonationDTO {
    private String fullName;
    private int dateOfBirth;
    private long telephone;
    private String email;
    private int height;
    private int weight;
    private String homeAddress;
    private String state;
    private String country;

    public OrganDonationDTO(String fullName,int dateOfBirth,long telephone,String email,int height,int weight,String homeAddress,String state,String country) {
        this.fullName = fullName;
        this.dateOfBirth=dateOfBirth;
        this.telephone=telephone;
        this.email=email;
        this.height=height;
        this.weight=weight;
        this.homeAddress=homeAddress;
        this.state=state;
        this.country=country;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "OrganDonationDTO{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", homeAddress='" + homeAddress + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
