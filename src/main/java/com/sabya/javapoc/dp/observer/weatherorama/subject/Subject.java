package com.sabya.javapoc.dp.observer.weatherorama.subject;

import com.sabya.javapoc.dp.observer.weatherorama.observers.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
