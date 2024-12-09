package com.xworkz.formapp.dto;

public class JobDTO {
    private String fullName;
    private String fatherName;
    private String permanentAddress;
    private String addressOfCorrespondence;
    private int dateOfBirth;
    private String sex;
    private String religion;
    private String nationality;
    private String state;
    private String email;

    public JobDTO(String fullName,String fatherName,String permanentAddress,String addressOfCorrespondence,int dateOfBirth,String sex,String religion,String nationality,String state,String email) {
        this.fullName = fullName;
        this.fatherName=fatherName;
        this.permanentAddress=permanentAddress;
        this.addressOfCorrespondence=addressOfCorrespondence;
        this.dateOfBirth=dateOfBirth;
        this.sex=sex;
        this.religion=religion;
        this.nationality=nationality;
        this.state=state;
        this.email=email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getAddressOfCorrespondence() {
        return addressOfCorrespondence;
    }

    public void setAddressOfCorrespondence(String addressOfCorrespondence) {
        this.addressOfCorrespondence = addressOfCorrespondence;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "JobDTO{" +
                "fullName='" + fullName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", addressOfCorrespondence='" + addressOfCorrespondence + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sex='" + sex + '\'' +
                ", religion='" + religion + '\'' +
                ", nationality='" + nationality + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
