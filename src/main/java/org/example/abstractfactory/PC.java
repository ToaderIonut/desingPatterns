package org.example.abstractfactory;

public class PC extends Computer {
    private Integer ram;
    private Integer hardDisk;

    public PC(Integer ram, Integer hardDisk) {
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    @Override
    public String getRam() {
        return "Ram pc: " + ram;
    }

    @Override
    public String getHardDisk() {
        return "Hard disk pc: " + hardDisk;
    }
}
