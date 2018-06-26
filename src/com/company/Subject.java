package com.company;

import java.util.ArrayList;

public class Subject {
    private int x;
    private int y;
    private ArrayList<Observer> observers = new ArrayList<>();

    void addObserver(Observer o) {
        this.observers.add(o);
    }
    void deleteObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >=0) {
            this.observers.remove(i);
        }
    }
    void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this);
        }
    }



    int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }
}
