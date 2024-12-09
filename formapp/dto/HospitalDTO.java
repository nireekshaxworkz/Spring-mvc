package com.xworkz.formapp.dto;

public class HospitalDTO {
    private String patientName;
    private long patientContact;
    private int patientConsultationTiming;
    private int patientAge;
    private String patientAddress;

    public HospitalDTO(String patientName, long patientContact, int patientConsultationTiming, int patientAge, String patientAddress) {
        this.patientName = patientName;
        this.patientContact = patientContact;
        this.patientConsultationTiming = patientConsultationTiming;
        this.patientAge = patientAge;
        this.patientAddress = patientAddress;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public long getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(long patientContact) {
        this.patientContact = patientContact;
    }

    public int getPatientConsultationTiming() {
        return patientConsultationTiming;
    }

    public void setPatientConsultationTiming(int patientConsultationTiming) {
        this.patientConsultationTiming = patientConsultationTiming;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public HospitalDTO() {
        System.out.println("no argument constructor");
    }
}
