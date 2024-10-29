package com.lbg.classes;

import com.lbg.classes.CarColor;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Car extends Vehicle {

    private int speed;
    private String make;
    private CarColor Color;
    private String model;
    private String reg;
    private static Set<String> carRegList = new HashSet<>();

    public Car() {
        this("UNKNOWN", "UNKNOWN", CarColor.WHITE);
    }

    public Car(String make) {
        this(make, "UNKNOWN", CarColor.WHITE);
    }

    public Car(String make, String model) {
        this(make, model, CarColor.WHITE);
    }

    public Car(CarColor Color) {
        this("UNKNOWN", "UNKNOWN", Color);
    }

    public Car(String make, String model, CarColor Color, String reg) {
        this.setReg(reg);
        this.Color = Color;
        this.model = model;
        this.make = make;
    }

    public Car(String make, String model, CarColor Color) {
        this.generateUniqueReg();
        this.Color = Color;
        this.model = model;
        this.make = make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    public int getSpeed() {
        return this.speed;
    }

    public CarColor getColor() {
        return Color;
    }

    public void setColor(CarColor Color) {
        this.Color = Color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void accelerate(int deltaV) {
        if (deltaV > 0) {
            this.speed += deltaV;
        }
    }

    public void setReg(String reg) {
        if (carRegList.add(reg.toUpperCase().replace(" ", ""))) {
            this.reg = reg;
        } else {
            throw new IllegalArgumentException("Car registration invalid");
        }
    }

    public void generateUniqueReg() {
        String uniqueReg;
        do {
            uniqueReg = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        } while (!carRegList.add(uniqueReg));
        this.reg = uniqueReg;
    }

    public void deccelerate(int deltaV) {
        this.accelerate(-deltaV);
    }

    @Override
    public String toString() {
        return String.format(
                "Car: {Registration: %s, Make: %s, Model: %s, Color: %s, Speed: %d}",
                this.reg, this.make, this.model, this.Color, this.speed
        );
    }
}