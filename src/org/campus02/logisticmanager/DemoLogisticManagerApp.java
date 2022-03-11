package org.campus02.logisticmanager;

public class DemoLogisticManagerApp {

    public static void main(String[] args) {

        Car c = new Car("VW Golf", "blue", 1700);
        Shirt s = new Shirt("Hugo Boss", "S", "red");

        LogisticManager lm = new LogisticManager();
        lm.add(c);
        lm.add(s);

        // irgendwann sollen die Objekte transportiert werden
        lm.moveAll("Graz");

    }
}
