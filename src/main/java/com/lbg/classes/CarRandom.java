package com.lbg.classes;

import com.lbg.classes.CarColor;
import java.util.Random;

public class CarRandom {

    static CarColor[] colorList = CarColor.values();

    public static void main(String[] args) {
        System.out.println(randomColor());
    }

    public static CarColor randomColor() {
        Random random = new Random();
        return colorList[random.nextInt(colorList.length)];
    }
}
