package com.corejava.applet;

import java.applet.Applet;
import java.awt.*;

public class BasicHello extends Applet {
    public static void main(String[] args) {
    }

    public void paint(Graphics g) {
        g.drawString("Hello Java", 10, 100);
        g.drawLine(10,10,50,50);
        g.drawRect(10,20,40,30);
        g.fillRect(60,10,30,80);
        g.drawOval(20,20,200,100);
        g.fillOval(70,30,100,100);
        g.setColor(Color.orange);

    }
}