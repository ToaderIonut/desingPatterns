package org.example.decorator;

public class SportsCar extends CarDecorator{
    private int horsePowerToAdd;

    public SportsCar(Car car, int horsePowerToAdd) {
        super(car);
        this.horsePowerToAdd = horsePowerToAdd;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Added sports elements. New horse power:" + super.car.changeHorsePower(horsePowerToAdd));
    }

    public SportsCar(Car car) {
        super(car);
    }
}
