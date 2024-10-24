package com.lbg;

import com.lbg.classes.Car;
import com.lbg.classes.CarColor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        //CarColor newColor;
        Car bartCar = new Car("Toyota Hilux, Taliban edition");
        bartCar.setColor(CarColor.RED);
        //bartCar.setModel("Toyota Hilux, Taliban edition");
        System.out.println(bartCar.getSpeed());
        System.out.println(bartCar.getColor());
        bartCar.accelerate(30);
        System.out.println(bartCar.getSpeed());
        bartCar.decelerate(30);
        System.out.println(bartCar.getSpeed());
        Car lisaCar = new Car("Land Cruiser, Taliban edition");
        lisaCar.accelerate(40);
        System.out.println(lisaCar.getSpeed());
        Car[] cars = new Car[3];
        cars[0] = bartCar;
        cars[1] = lisaCar;
        cars[2] = new Car();

        for (Car currentCar:cars){
            System.out.println(currentCar.getSpeed());
            System.out.println(currentCar.getColor());
            System.out.println(currentCar.getModel());
        }
    }
}