package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class course implements Subject {
    private String name;
    private String availability;
    private List<Observer>observerList;
    public course(String name){
        this.name=name;
        observerList=new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllSubscribes() {
        for (Observer observer:observerList){
            observer.update(availability);
        }
    }

    public void setAvailability(boolean available) {
        availability = this.name+(available ?" Availabel" :" Not Availabel " );
        notifyAllSubscribes();
    }
}
