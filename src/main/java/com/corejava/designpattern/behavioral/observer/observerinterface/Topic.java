package com.corejava.designpattern.behavioral.observer.observerinterface;

import com.corejava.designpattern.behavioral.observer.observerabstract.Observer;

public interface Topic {
    public void register(Observer obj);
    public void notifyObserver(String line);
}