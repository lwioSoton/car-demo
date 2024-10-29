package com.lbg.classes;

public class Vehicle {

    public Vehicle() {
        this.setNumberOfWheels(0);
        this.setRegistrationNumber("Unregistered");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    private int numberOfWheels;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    private String registrationNumber;

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}