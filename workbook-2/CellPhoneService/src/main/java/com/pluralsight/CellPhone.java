package com.pluralsight;

public class CellPhone {
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this. model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public long getSerialNumber() { return serialNumber; }

    public void setSerialNumber(long serialNumber) { this.serialNumber = serialNumber; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getCarrier() { return carrier; }

    public void setCarrier(String carrier) { this.carrier = carrier; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getOwner() { return owner; }

    public void setOwner(String owner) { this.owner = owner; }

    @Override
    public String toString() {
        return "CellPhone{" +
                "serialNumber=" + serialNumber +
                ", model='" + model + '\'' +
                ", carrier='" + carrier + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
