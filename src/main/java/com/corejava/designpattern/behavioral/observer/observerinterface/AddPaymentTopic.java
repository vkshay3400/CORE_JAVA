package com.corejava.designpattern.behavioral.observer.observerinterface;

import com.corejava.designpattern.behavioral.observer.observerabstract.Observer;

import java.util.ArrayList;
import java.util.List;

public class AddPaymentTopic implements Topic {

    List addPaymentObservers = new ArrayList<>();

    @Override
    public void register(Observer obj) {
        addPaymentObservers.add(obj);
    }

    @Override
    public void notifyObserver(String line) {
        for (Observer obj : addPaymentObservers)
            obj.update(line);
    }
}