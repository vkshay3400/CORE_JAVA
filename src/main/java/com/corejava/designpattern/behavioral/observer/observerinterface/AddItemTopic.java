package com.corejava.designpattern.behavioral.observer.observerinterface;

import com.corejava.designpattern.behavioral.observer.observerabstract.Observer;

import java.util.ArrayList;
import java.util.List;

public class AddItemTopic implements Topic {

    List addItemObservers = new ArrayList();

    @Override
    public void register(Observer o) {
        addItemObservers.add(o);
    }

    @Override
    public void notifyObserver(String line) {
        for (Observer o : addItemObservers)
            o.update(line);
    }
}