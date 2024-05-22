package org.example.decorator;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar("red", 100);
//        basicCar.assemble();
        Car luxuryCar = new LuxuryCar(basicCar, true);
//        luxuryCar.assemble();
        Car sportsLuxuryCar = new SportsCar(luxuryCar,50);
//        sportsLuxuryCar.assemble();
        Car basicCar2 = new BasicCar("blue", 110);
        Car sportsCar = new SportsCar(basicCar2, 10);
        sportsCar.assemble();
    }
}
