package org.example.observer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber("Ionut");
//        Channel channel1 = new Channel("Canalul 1");
//        channel1.registerSubscriber(sub1);
//        Subscriber sub2 = new Subscriber("Robert");
//        channel1.registerSubscriber(sub2);
//        channel1.notify("haide in parc");
//        System.out.println(sub1.getSubTime());
//        sub2.setSubTime(LocalDate.of(1999,06,29));
//        channel1.notifyOldSub("bine ai venit", 2000);
        ChannelHashMap channel2 = new ChannelHashMap("Canal 2");
        channel2.registerSubscriber(sub1);
        channel2.notifyOldSubHashMap("hai la fotbal", 2020);


    }
}
