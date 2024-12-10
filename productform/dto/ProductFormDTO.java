package com.xworkz.productform.dto;

public class ProductFormDTO {
    private String name;
    private String type;
    private String cost;
    private String manufacture;
    private String manufactureDate;
    private String warranty;

    public ProductFormDTO(String name, String type, String cost, String manufacture, String manufactureDate, String warranty) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.manufacture = manufacture;
        this.manufactureDate = manufactureDate;
        this.warranty = warranty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
}
