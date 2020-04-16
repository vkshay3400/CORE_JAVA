package com.corejava.designpattern.behavioral.observer.item_payment_order;

import com.corejava.designpattern.behavioral.observer.observerabstract.CashierDisplay;
import com.corejava.designpattern.behavioral.observer.observerabstract.CustomerDisplay;
import com.corejava.designpattern.behavioral.observer.observerabstract.Observer;
import com.corejava.designpattern.behavioral.observer.observerinterface.AddItemTopic;
import com.corejava.designpattern.behavioral.observer.observerinterface.AddPaymentTopic;
import com.corejava.designpattern.behavioral.observer.observerinterface.CompleteOrderTopic;
import com.corejava.designpattern.behavioral.observer.observerinterface.Topic;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List cart = new ArrayList();
    List payment = new ArrayList();

    private Topic addItemTopic;
    private Topic addPaymentTopic;
    private Topic completeOrderTopic;

    public Order() {

        Observer customerDisplay = new CustomerDisplay();
        Observer cashierDisplay = new CashierDisplay();

        addItemTopic = new AddItemTopic();
        addPaymentTopic = new AddPaymentTopic();
        completeOrderTopic = new CompleteOrderTopic();

        // CUSTOMER DISPLAY
        addItemTopic.register(customerDisplay);
        addPaymentTopic.register(customerDisplay);
        completeOrderTopic.register(customerDisplay);

        // CASHIER DISPLAY
        addItemTopic.register(cashierDisplay);
        addPaymentTopic.register(cashierDisplay);
        completeOrderTopic.register(cashierDisplay);
    }

    public void addItem(Item item){
        cart.add(item);
        String line = item.name + "$" + item.price;
        addItemTopic.notifyObserver(line);
    }

    public void makePayment(Payment payment){
        payment.add(payment);
        String line = payment.type + "$" + payment.amount;
        addPaymentTopic.notifyObserver(line);
    }

    public void completeOrder(){
        String line = "Order Completed";
        completeOrderTopic.notifyObserver(line);
    }
}