package com.corejava.designpattern.behavioral.observer.observerinterface;

import com.corejava.designpattern.behavioral.observer.observerabstract.Observer;

import java.util.ArrayList;
import java.util.List;

public class CompleteOrderTopic implements Topic {

    List orderCompletedObservers = new ArrayList();

    @Override
    public void register(Observer obj) {
        orderCompletedObservers.add(obj);
    }

    @Override
    public void notifyObserver(String line) {
        for (Observer obj : orderCompletedObservers)
            obj.update(line);
    }
}