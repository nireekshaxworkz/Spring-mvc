package com.xworkz.formapp.dto;

public class DeathCertificateDTO {
    private String deceasedName;
    private int deceasedAge;
    private String deceasedAddress;
    private String deceasedDOB;
    private String deceasedLastDate;
    private String deceasedCause;

    public DeathCertificateDTO(String deceasedName,int deceasedAge,String deceasedAddress,String deceasedDOB,String deceasedLastDate,String deceasedCause) {
        this.deceasedName = deceasedName;
        this.deceasedAge=deceasedAge;
        this.deceasedAddress=deceasedAddress;
        this.deceasedDOB=deceasedDOB;
        this.deceasedLastDate=deceasedLastDate;
        this.deceasedCause=deceasedCause;
    }

    public String getDeceasedName() {
        return deceasedName;
    }

    public void setDeceasedName(String deceasedName) {
        this.deceasedName = deceasedName;
    }

    public int getDeceasedAge() {
        return deceasedAge;
    }

    public void setDeceasedAge(int deceasedAge) {
        this.deceasedAge = deceasedAge;
    }

    public String getDeceasedAddress() {
        return deceasedAddress;
    }

    public void setDeceasedAddress(String deceasedAddress) {
        this.deceasedAddress = deceasedAddress;
    }

    public String getDeceasedDOB() {
        return deceasedDOB;
    }

    public void setDeceasedDOB(String deceasedDOB) {
        this.deceasedDOB = deceasedDOB;
    }

    public String getDeceasedLastDate() {
        return deceasedLastDate;
    }

    public void setDeceasedLastDate(String deceasedLastDate) {
        this.deceasedLastDate = deceasedLastDate;
    }

    public String getDeceasedCause() {
        return deceasedCause;
    }

    public void setDeceasedCause(String deceasedCause) {
        this.deceasedCause = deceasedCause;
    }
}
