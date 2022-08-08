package org.hillel.lessons.intfce;

public interface Flyable {

    void fly();

    default void canFly () {
        System.out.println("I can fly");
    }
}
