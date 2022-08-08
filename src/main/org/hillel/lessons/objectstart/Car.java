package org.hillel.lessons.objectstart;

public class Car {

    private String color;

    public static void main(String[] args) {

        Car littleCar = new Car();
        littleCar.color = "Red";

        Car bigCar = new Car();
        bigCar.color = "Black";

        System.out.println(littleCar);
        System.out.println(bigCar);

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }

}
