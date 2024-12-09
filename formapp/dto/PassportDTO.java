package com.xworkz.formapp.dto;

public class PassportDTO {
    private String registerToApplyAt;
    private String passportOffice;
    private String givenName;
    private String sureName;
    private String dateOfBirth;
    private String emailId;
    private String doYouWantYourLoginIdToBeSameAsEmailId;
    private String loginId;
    private String password;
    private String conformPassword;
    private String hintQuestion;
    private String hintAnswer;

    public PassportDTO(String registerToApplyAt, String passportOffice, String givenName, String sureName, String dateOfBirth, String emailId, String doYouWantYourLoginIdToBeSameAsEmailId, String loginId, String password, String conformPassword, String hintQuestion, String hintAnswer) {
        this.registerToApplyAt = registerToApplyAt;
        this.passportOffice = passportOffice;
        this.givenName = givenName;
        this.sureName = sureName;
        this.dateOfBirth = dateOfBirth;
        this.emailId = emailId;
        this.doYouWantYourLoginIdToBeSameAsEmailId = doYouWantYourLoginIdToBeSameAsEmailId;
        this.loginId = loginId;
        this.password = password;
        this.conformPassword = conformPassword;
        this.hintQuestion = hintQuestion;
        this.hintAnswer = hintAnswer;
    }

    public String getRegisterToApplyAt() {
        return registerToApplyAt;
    }

    public void setRegisterToApplyAt(String registerToApplyAt) {
        this.registerToApplyAt = registerToApplyAt;
    }

    public String getPassportOffice() {
        return passportOffice;
    }

    public void setPassportOffice(String passportOffice) {
        this.passportOffice = passportOffice;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDoYouWantYourLoginIdToBeSameAsEmailId() {
        return doYouWantYourLoginIdToBeSameAsEmailId;
    }

    public void setDoYouWantYourLoginIdToBeSameAsEmailId(String doYouWantYourLoginIdToBeSameAsEmailId) {
        this.doYouWantYourLoginIdToBeSameAsEmailId = doYouWantYourLoginIdToBeSameAsEmailId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConformPassword() {
        return conformPassword;
    }

    public void setConformPassword(String conformPassword) {
        this.conformPassword = conformPassword;
    }

    public String getHintQuestion() {
        return hintQuestion;
    }

    public void setHintQuestion(String hintQuestion) {
        this.hintQuestion = hintQuestion;
    }

    public String getHintAnswer() {
        return hintAnswer;
    }

    public void setHintAnswer(String hintAnswer) {
        this.hintAnswer = hintAnswer;
    }

    public PassportDTO() {
        System.out.println("no agrument constructor");
    }
}
