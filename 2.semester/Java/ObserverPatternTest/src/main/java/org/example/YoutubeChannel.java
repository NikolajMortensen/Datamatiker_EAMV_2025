package org.example;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String channelName;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update("New video from  " + channelName + " : " + message);
        }
    }

    public void uploadVideo(String title) {
        System.out.println(channelName + " uploaded a new video: " + title);
        notifyObservers(title);
    }

}