package org.hillel.lessons.lessonthree;

import java.rmi.AlreadyBoundException;

public class LessonThree {
    public static void main(String[] args) {

        printGreetings("Alex");
        printGreetings("Robert");
        printGreetings("Nikolai");

        String cityRome = "Rome";
        String cityLondon = "London";
        String cityParis = "Paris";
        String cityBerlin = "Berlin";

        double ticketPriceToRome = 112.30;
        double ticketPriceToLondon = 140.70;
        double ticketPriceToParis = 125.45;
        double ticketPriceToBerlin = 85.85;

        int passengerCount = 4;
        double discount = 0.1;

        double fullPriceToParis = calculateTicketPrice(passengerCount, ticketPriceToParis, discount);
        double fullPriceToRome = calculateTicketPrice(passengerCount, ticketPriceToRome, discount);
        double fullPriceToBerlin = calculateTicketPrice(passengerCount, ticketPriceToBerlin, discount);
        double fullPriceToLondon = calculateTicketPrice(passengerCount, ticketPriceToLondon, discount);

        printFullPrice(fullPriceToRome, cityRome);
        printFullPrice(fullPriceToLondon, cityLondon);
        printFullPrice(fullPriceToBerlin, cityBerlin);
        printFullPrice(fullPriceToParis, cityParis);

    }

    public static void printGreetings(String name) {
        System.out.println("Hello, " + name);
        System.out.println("Welcome to our agency");
        System.out.println("Please, choose the direction");

    }

    public static void printFullPrice(double fullPrice, String city) {
        System.out.println("Full Price to " + city + " is " + fullPrice);
    }

    public static double calculateTicketPrice(int passengerCount, double price, double discount) {
        double fullPrice = passengerCount * price;
        double fullPriceWithDiscount = fullPrice * discount;

        return fullPriceWithDiscount;
    }
}
