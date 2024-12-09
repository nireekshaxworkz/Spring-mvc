package com.xworkz.formapp.dto;

public class MatrimonyDTO {
    private String name;
    private long phoneNumber;
    private String gender;
    private String profileCreatedFor;
    private String motherTongue;
    private String religion;
    private String caste;
    private String email;
    private String password;
    private String address;

    public MatrimonyDTO(String name,long phoneNumber,String gender,String profileCreatedFor,String motherTongue,String religion,String caste,String email,String password,String address) {
        this.name = name;
        this.phoneNumber=phoneNumber;
        this.gender=gender;
        this.profileCreatedFor=profileCreatedFor;
        this.motherTongue=motherTongue;
        this.religion=religion;
        this.caste=caste;
        this.email=email;
        this.password=password;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfileCreatedFor() {
        return profileCreatedFor;
    }

    public void setProfileCreatedFor(String profileCreatedFor) {
        this.profileCreatedFor = profileCreatedFor;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MatrimonyDTO{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gender='" + gender + '\'' +
                ", profileCreatedFor='" + profileCreatedFor + '\'' +
                ", motherTongue='" + motherTongue + '\'' +
                ", religion='" + religion + '\'' +
                ", caste='" + caste + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
