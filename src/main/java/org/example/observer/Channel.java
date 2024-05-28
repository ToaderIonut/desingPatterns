package org.example.observer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;
//    private HashMap<Subscriber, LocalDate> subscriberLocalDateHashMap;

    public Channel(List<Subscriber> subscribers, String channelName) {
        this.subscribers = subscribers;
        this.channelName = channelName;
    }

    public Channel(String channelName) {
//        this.subscribers = new ArrayList<>();
        this.channelName = channelName;
    }

    public void registerSubscriber(Subscriber subscriber) {
        subscriber.setSubTime(LocalDate.from(LocalTime.now()));
        subscribers.add(subscriber);
        System.out.println(subscriber + " has been added.");
    }

    public void notify(String message) {
//        for (int i = 0; i < subscribers.size(); i++) {
//            subscribers.get(i).receiveMessage(message);
//        }
        for (Subscriber subscriber : subscribers) {
            subscriber.receiveMessage(message);
        }
    }

    public void notifyOldSub(String message, int time) {
//        for (int i = 0; i < subscribers.size(); i++) {
//            subscribers.get(i).receiveMessage(message);
//        }
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getSubTime().getYear() > time) {
                subscriber.receiveMessage(message);
            }
        }

    }
}
