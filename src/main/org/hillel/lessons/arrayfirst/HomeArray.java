package org.hillel.lessons.arrayfirst;

import java.util.Scanner;

public class HomeArray {

    public static void main(String[] args) {

        String[] cities = {"Florence", "Palermo", "Rome", "Paris", "Madrid", "Berlin", "Vienna", "Amsterdam", "Oslo", "London"};
        double[] prices = {85.25, 90.50, 110.75, 125.25, 140.50, 150.0};
        int[] connection = {2, 5, 1, 0, 3, 4, 1, 2, 5, 3};

        getArrayElements(cities);
        getArrayElements(prices);
        getReverseArrayElements(cities);
        getReverseArrayElements(prices);
        getConnection(cities, prices, connection);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Please, enter yor name:");
        String name = getData(scanner);

        System.out.println("Hello, " + name + ". Please, enter MIN value of ticket price:");
        double minValueFromConsole = 0;
        while (true) {
            minValueFromConsole = getIntegerUserDataFromConsole(scanner);
            if (minValueFromConsole >= 0) {
                break;
            }
            System.out.println("Incorrect input data. Please, try again:");
        }

        System.out.println("Please, enter MAX value of ticket price:");
        double maxValueFromConsole = 0;
        while (true) {
            maxValueFromConsole = getIntegerUserDataFromConsole(scanner);
            if (maxValueFromConsole > 0 && maxValueFromConsole >= minValueFromConsole) {
                break;
            }
            System.out.println("Incorrect input data. Please, try again:");
        }

        System.out.println("Your price diapason is: from $" + minValueFromConsole + " to $" + maxValueFromConsole);
        System.out.println();

        double min = 0;
        double max = 0;
        minMaxPrices(min, max, prices, maxValueFromConsole, minValueFromConsole);

        getDirectionFromDiapason(cities, prices, connection, maxValueFromConsole, minValueFromConsole);

        scanner.close();
    }

    public static void minMaxPrices(double min, double max, double[] price, double maxV, double minV) {
        min = max = price[0];
        for (int i = 1; i < price.length; i++) {
            if (price[i] < min) min = price[i];
            if (price[i] > max) max = price[i];
        }
        if (max < minV | min > maxV) {
            System.out.println("There is no available directions in this price diapason");
            System.out.println("MIN & MAX ticket price: $" + min + "& $" + max);
            System.exit(0);
        }
        System.out.println("MIN & MAX ticket price: $" + min + "& $" + max);
        System.out.println();
    }

    public static void getDirectionFromDiapason(String[] arrayCities, double[] arrayPrices, int[] arrayConnection,
                                                double maxValue, double minValue) {
        System.out.println("The result of searching by your filter:");
        System.out.println();
        for (int i = 0; i < arrayCities.length; i++) {
            int element = arrayConnection[i];
            if (minValue <= arrayPrices[element] & maxValue >= arrayPrices[element]) {
                System.out.println("Ticket price to " + arrayCities[i] + " is $" + arrayPrices[element]);
            }
        }
    }

    public static double getIntegerUserDataFromConsole(Scanner scanner) {
        try {
            return Double.parseDouble(scanner.next());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static String getData(Scanner scanner) {
        return scanner.next();
    }

    public static void getConnection(String[] arrayCities, double[] arrayPrices, int[] arrayConnection) {
        for (int i = 0; i < arrayCities.length; i++) {
            int element = arrayConnection[i];
            System.out.println("Ticket price to " + arrayCities[i] + " is $" + arrayPrices[element]);
        }
    }

    public static void getArrayElements(String[] cities) {
        for (String array : cities) {
            System.out.println("Direction: " + array);
        }
        System.out.println();
    }

    public static void getArrayElements(double[] prices) {
        for (double array : prices) {
            System.out.println("Price: " + array);
        }
        System.out.println();
    }

    public static void getReverseArrayElements(String[] cities) {
        for (int i = cities.length - 1; i >= 0; i--) {
            System.out.println("i = " + i + ", cities[" + i + "] = " + cities[i]);
        }
        System.out.println();
    }

    public static void getReverseArrayElements(double[] prices) {
        for (int i = prices.length - 1; i >= 0; i--) {
            System.out.println("i = " + i + ", prices[" + i + "] = " + prices[i]);
        }
        System.out.println();
    }
}

//      public static void outputArrayThird(double[] arrayTicketPrice, String[] arrayDirection, int[] arrayThird) {
//      System.out.println();
//      Random randomIndexTicketPrice = new Random(); // объявление метода (класса) Random для случайного распределения цен по направлениям
//      System.out.println("Distribution of ticket prices by direction ");
//      for (int i = 0; i < arrayDirection.length; i++) {    // заполнение  третьего массива данными случайным образом
//          arrayThird[i] = randomIndexTicketPrice.nextInt(arrayTicketPrice.length);
//      }
//      for (int i = 0; i < arrayDirection.length; i++) {
//          int valueArrayThird = arrayThird[i];
//          System.out.println("Travel direction is " + arrayDirection[i] + " ticket price  is $" + arrayTicketPrice[valueArrayThird]);
//      }
//      System.out.println();
//  }
