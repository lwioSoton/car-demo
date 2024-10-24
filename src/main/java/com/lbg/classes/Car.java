package com.lbg.classes;

public class Car {
    public Car(String model){
        setModel(model);
    }
    public Car(){
        make = "Unknown";
        setModel("Unknown");   //Using a built function is better,
        // as we want nothing to break if we change the built function.
    }
    private int speed;
    private String make;
    public CarColor color;
    private String model;
    public int getSpeed(){
        return speed;
    }
    public String getMake(){
        return make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public CarColor getColor(){
        return color;
    }
    public void setColor(CarColor newColor){
        color = newColor;
    }
    public void accelerate(int acc){
        if(acc > 0)
            speed += acc;
    }
    public void decelerate(int dec){
        if(dec > 0)
            speed -= dec;
    }
}
