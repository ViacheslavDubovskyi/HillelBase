package org.hillel.lessons.lessonthree;

public class HomeTrip {
    public static void main(String[] args) {

        double fullPrice;
        double ticketPriceToFlorence = 115.45;
        int countPassengers = 3;
        double additionalCost = 80.88;

        printGreetings("Yunona");

        System.out.println("Стоимость билета во Флоренцию: " + ticketPriceToFlorence);
        System.out.println("Количество пассажиров: " + countPassengers);

        fullPrice = calculateFullPrice(countPassengers, ticketPriceToFlorence);
        System.out.println("Полная стоимость перелета: " + fullPrice);

        double fullAddCost = calculateAdditionalCost(countPassengers, additionalCost);
        System.out.println("Дополнительные расходы: " + fullAddCost);

        double totalPrice = calculateTotalPrice(fullPrice, fullAddCost);
        System.out.println("Итоговая стоимость путешествия: " + totalPrice);

        double totalPriceMethods = totalPriceMethods(ticketPriceToFlorence, countPassengers, additionalCost);
        System.out.println("Итоговая стоимость путешествия (через методы): " + totalPriceMethods);

    }

    public static void printGreetings(String name) {
        System.out.println("Hello, " + name);
        System.out.println("Welcome to our agency");
        System.out.println("Please, choose the direction");
    }

    public static double calculateFullPrice(int countPassengers, double ticketPrice) {
        return countPassengers * ticketPrice;
    }

    public static double calculateAdditionalCost(int countPassengers, double additionalCost) {
        return countPassengers * additionalCost;
    }

    public static double calculateTotalPrice(double fullPrice, double fullAddCost) {
        return fullPrice + fullAddCost;
    }

    public static double totalPriceMethods(double ticketPrice, int countPassengers, double additionalCost) {
        return calculateFullPrice(countPassengers, ticketPrice) + calculateAdditionalCost(countPassengers, additionalCost);
    }
}