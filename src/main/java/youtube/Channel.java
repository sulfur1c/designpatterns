package main.java.youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String channelName;
    private String status;


    public Channel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        this.observers.forEach(observer -> observer.update(status));
    }

    private String setStatus(String status){
        return this.status = status;
    }

    private String getStatus() {
        return this.status;
    }
}
