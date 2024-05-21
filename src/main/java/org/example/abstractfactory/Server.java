package org.example.abstractfactory;

public class Server  extends Computer {
    private Integer ramPerComponent;
    private Integer hddPerComponent;
    private Integer numberOfComponents;


    public Server(Integer ramPerComponent, Integer hddPerComponent, Integer numberOfComponents) {
        this.ramPerComponent = ramPerComponent;
        this.hddPerComponent = hddPerComponent;
        this.numberOfComponents = numberOfComponents;
    }

    @Override
    public String getRam() {
        return "Ram server: " + ramPerComponent * numberOfComponents;
    }

    @Override
    public String getHardDisk() {
        return "Hard disk server: " + hddPerComponent * numberOfComponents;
    }
}
