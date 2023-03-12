package Test_Classes;

import Data_Classes.Car2;

public class CarTest {

    public static void main(String[] args) {

        Car2 car = new Car2();
        car.setColor("red");
        car.setSpeed(20);
        car.setEngine("V8");

        System.out.println(car.getSpeed());
        car.speedUp(30);
        System.out.println(car.getSpeed());
        car.speedDown(15);
        System.out.println(car.getSpeed());
    }
}
