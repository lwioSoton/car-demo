package com.lbg;

import com.lbg.classes.Car;
import com.lbg.classes.CarColor;
import com.lbg.classes.CarRandom;
import java.util.HashMap;

public class Main {

    static Car[] listOfCars = new Car[100];

    public static void main(String[] args) {
        Car bartCar = new Car();
        bartCar.setColor(CarColor.RED);
        bartCar.setModel("RS3");
        bartCar.setMake("Audi");

        System.out.println("Car Model: " + bartCar.getModel());
        System.out.println("Car Color: " + bartCar.getColor());
        bartCar.accelerate(100);
        System.out.println("Current Speed for car: " + bartCar.getSpeed());

        Car lisacar = new Car("RS4");
        System.out.println("Lisa's car: " + lisacar.getModel());
        lisacar.accelerate(200);
        System.out.println("Speed of Lisa's car: " + lisacar.getSpeed());

        System.out.println("\n\n---------------------\n\n");

        Car[] cars = new Car[3];
        cars[0] = bartCar;
        cars[1] = lisacar;
        cars[2] = new Car();

        for (Car car : cars) {
            System.out.println(car.getModel());
            System.out.println(car.getColor());
        }

        for (int i = 0; i < listOfCars.length; i++) {
            listOfCars[i] = new Car(CarRandom.randomColor());
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(listOfCars[i]);
        }

        HashMap<CarColor, Integer> map = countColors();
        for (CarColor Color : map.keySet()) {
            System.out.println(Color + " : " + map.get(Color));
        }
    }

    private static HashMap<CarColor, Integer> countColors() {
        HashMap<CarColor, Integer> map = new HashMap<>();
        for (Car car : listOfCars) {
            if (map.containsKey(car.getColor())) {
                map.put(car.getColor(), map.get(car.getColor()) + 1);
            } else {
                map.put(car.getColor(), 1);
            }
        }
        return map;
    }
}
