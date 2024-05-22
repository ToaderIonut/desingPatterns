package org.example.decorator;

public class LuxuryCar extends CarDecorator{
    private boolean leatherSeats;

    @Override
    public String toString() {
        return "LuxuryCar{" +
                "leatherSeats=" + leatherSeats +
                '}';
    }

    public LuxuryCar(Car car, boolean leatherSeats) {
        super(car);
        this.leatherSeats = leatherSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding luxury elements. Leather seats: " + leatherSeats);
    }

    public LuxuryCar(Car car) {
        super(car);
    }
}
