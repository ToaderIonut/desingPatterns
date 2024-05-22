package org.example.decorator;

public class BasicCar  implements Car{
    private String colour;
    private int horsePower;

    @Override
    public String toString() {
        return "BasicCar{" +
                "colour='" + colour + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }

    public BasicCar(String colour, int horsePower) {
        this.colour = colour;
        this.horsePower = horsePower;
    }

    @Override
    public void assemble() {
        System.out.println("Preparing basic car: " + colour + " " + horsePower);

    }

    @Override
    public int changeHorsePower(int value) {
//        this.horsePower = this.horsePower + value;
        this.horsePower += value;
        return horsePower;
    }
}
