package org.hillel.lessons.oop.abs;

public class Phone extends CommunicationDevice {

    public void connectToPower() {
        System.out.println(powerSource + " " + connectSource);
    }
}
