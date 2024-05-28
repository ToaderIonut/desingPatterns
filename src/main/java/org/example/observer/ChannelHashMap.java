package org.example.observer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChannelHashMap {
    private List<Subscriber> subscribers = new ArrayList<>();
private String channelName;
private HashMap<String, LocalDate> subscribersHash = new HashMap<>();

    public ChannelHashMap(String channelName) {
        this.channelName = channelName;
    }
    public void registerSubscriber(Subscriber subscriber) {
        subscriber.setSubTime(LocalDate.from(LocalTime.now()));
        subscribersHash.put(subscriber.getName(), LocalDate.now());
        subscribers.add(subscriber);
        System.out.println(subscriber + " has been added.");
    }
    public void notifyOldSubHashMap(String message, int time) {
       for (int i = 0; i < subscribers.size(); i++) {
           if (subscribersHash.get(subscribers.get(i).getName()).getYear() > time)
           subscribers.get(i).receiveMessage(message);
        }
    }
}
