package com.xworkz.formapp.dto;

public class BankAccountDTO {
    private String bankName;
    private String personName;
    private long phoneNumber;

    public BankAccountDTO(String bankName, String personName, long phoneNumber) {
        this.bankName = bankName;
        this.personName = personName;
        this.phoneNumber = phoneNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BankAccountDTO() {
        System.out.println("no argument constructor");
    }
}
