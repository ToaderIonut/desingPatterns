package org.example.observer;

import java.time.LocalDate;

public class Subscriber {
    public String name;
    private LocalDate subTime;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getSubTime() {
        return subTime;
    }

    public void setSubTime(LocalDate subTime) {
        this.subTime = subTime;
    }

    public void receiveMessage(String message) {
        System.out.println(this.name + " has received: " + message);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subscriber ");
        sb.append(name);
        return sb.toString();

    }
}
