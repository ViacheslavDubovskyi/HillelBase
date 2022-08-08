package org.hillel.lessons.cycles;

import java.util.Scanner;

public class HomeCycle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Please, enter your name:");
        String name = getData(scanner);

        final String cityFlorence = "Florence";
        final String cityRome = "Rome";
        final String cityPalermo = "Palermo";
        final String cityMadrid = "Madrid";
        final String cityVienna = "Vienna";

        System.out.println("Hello, " + name + "!");
        System.out.println("Please, choose the direction. Available are: " + cityFlorence + ", " +
                cityRome + ", " + cityPalermo + ", " + cityMadrid + ", " + cityVienna + ":");
        String direction = getData(scanner);

        double ticketPrice = 0;
        int countTickets = 0;
        double additionalCost = 0;

        switch (direction) {
            case "Florence":
                ticketPrice = 115.45;
                countTickets = 3;
                additionalCost = 500.50;
                break;
            case "Rome":
                ticketPrice = 130.25;
                countTickets = 4;
                additionalCost = 700.50;
                break;
            case "Palermo":
                ticketPrice = 95.75;
                countTickets = 2;
                additionalCost = 430.50;
                break;
            case "Madrid":
                ticketPrice = 125.15;
                countTickets = 5;
                additionalCost = 380.50;
                break;
            case "Vienna":
                ticketPrice = 85.65;
                countTickets = 1;
                additionalCost = 330.50;
                break;
            default:
                System.out.println("Incorrect input of the direction");
                System.exit(0);
        }

        System.out.println("Please, enter number of passengers:");
        int countPassengersInt = 0 ;
        double countPassengers = countPassengersInt;
        int inputCountPass = 5;
        while (inputCountPass > 0) {
            countPassengers = getIntegerUserDataFromConsole(scanner);
            if (countPassengers > 0) {
                break;
            }
            inputCountPass--;
            System.out.println("Incorrect input. Please, try again. " + inputCountPass + " attempt(s) are(is) left");
            if (inputCountPass <= 0) {
                System.exit(0);
            }
        }

        System.out.println("Please, enter available funds:");
        double accountSum = 0;
        int inputCountMoney = 5;
        while (inputCountMoney > 0) {
            accountSum = getIntegerUserDataFromConsole(scanner);
            if (accountSum > 0) {
                break;
            }
            inputCountMoney--;
            System.out.println("Incorrect input. Please, try again. " + inputCountMoney + " attempt(s) are(is) left");
            if (inputCountMoney <= 0) {
                System.exit(0);
            }
        }

        printList(direction, ticketPrice, countTickets, additionalCost);
        System.out.println();

        double agencySum = 0;
        printTransactionOfMoney(accountSum, agencySum, ticketPrice, (int) countPassengers, countTickets);

        //double fullTicketPrice = calculateFullPrice(countPassengers, ticketPrice);
        //double fullAdditionalMoney = calculateAdditionalMoney(countPassengers, additionalCost);
        //double totalPriceOfJourney = calculateTotalPrice(fullTicketPrice, fullAdditionalMoney);

        double totalPriceOfJourney = getFullPriceToCity(ticketPrice, additionalCost, (int) countPassengers);
        int availableTickets = checkAvailableTickets(countTickets, (int) countPassengers);
        int availableMoney = checkAccountSum(accountSum, totalPriceOfJourney);
//     System.out.println("Уважаемый(ая) " + name + "! Вы выбрали направление " + direction + ". " +
//             "Количество пассажиров: " + (int) countPassengers + ". Полная стоимость путешествия составит: $" + totalPriceOfJourney);

        printExitText(availableTickets, availableMoney, countTickets,
                (int) countPassengers, accountSum, totalPriceOfJourney);
        scanner.close();
    }

    public static void printTransactionOfMoney(double accountSum, double agencySum, double ticketPrice,
                                               int requiredTickets, int countTickets) {
        agencySum = 0;
        for (int i = 1; i <= requiredTickets;) {
            agencySum += ticketPrice;
            accountSum -= ticketPrice;
            System.out.println("You buy " + i + " ticket(s). On your account: $" + accountSum + " are left");
            i++;
            if (accountSum <= ticketPrice) {
                System.out.println("Not enough money left on your account to buy a ticket. On your balance is: $" + accountSum);
                break;
            } else if (requiredTickets > countTickets) {
                System.out.println("Not enough available tickets. Missing " + (requiredTickets-countTickets) + " ticket(s)");
                break;
            }
        }
        System.out.println();
        System.out.println("Transaction to the agency account: $" + agencySum);
        System.out.println("Your balance after buying tickets: $" + accountSum);
        System.out.println();
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

    public static void printList(String city, double ticketPrice, int countTickets, double AdditionalCost) {
        System.out.println("Ticket price of 1 ticket to " + city + ": $" + ticketPrice);
        System.out.println("Number of available tickets: " + countTickets);
        System.out.println("Travel expenses per person: $" + AdditionalCost);
    }

    public static double calculateFullPrice(int countPassengers, double ticketPrice) {
        return countPassengers * ticketPrice;
    }

    public static double calculateAdditionalMoney(int countPassengers, double additionalCost) {
        return countPassengers * additionalCost;
    }

    public static double getFullPriceToCity(double ticketPrice, double addPrice, int countPassengers) {
        double fullPrice = calculateFullPrice(countPassengers, ticketPrice);
        double additionalPrice = calculateAdditionalMoney(countPassengers, addPrice);
        return calculateTotalPrice(fullPrice, additionalPrice);
    }

    public static double calculateTotalPrice(double fullPrice, double fullAddCost) {
        return fullPrice + fullAddCost;
    }

    public static int checkAvailableTickets(int countTickets, int countPassengers) {
        if (countTickets > countPassengers) {
            return 1;
        }
        if (countTickets < countPassengers) {
            return -1;
        }
        return 0;
    }

    public static int checkAccountSum(double accountSum, double ticketPrice) {
        if (accountSum > ticketPrice) {
            return 1;
        }
        if (accountSum < ticketPrice) {
            return -1;
        }
        return 0;
    }

    public static void printExitText(int availableTickets, int availableMoney, int countTickets,
                                     int countPassengers, double accountSum, double fullTicketPrice) {
        if (availableTickets >= 0 & availableMoney >= 0) {
            System.out.println("We want to inform you that the purchase of the tour was successful! T" +
                    "here are enough funds and tickets." + (countTickets - countPassengers) +" tickets are remain." +
                    "Your balance: $" + (accountSum - fullTicketPrice));
        }
        if (availableTickets == -1 & availableMoney == -1) {
            System.out.println("Unfortunately, there are not enough available tickets to purchase and funds on your account. " +
                    "Missing" + (countPassengers - countTickets) +
                    " ticket(s) и $" + (fullTicketPrice - accountSum));
        }
        else if (availableTickets == -1) {
            System.out.println("Unfortunately, there are not enough available tickets to purchase. " +
                    "Missing " + (countPassengers - countTickets) + " ticket(s).");
        }
        else if (availableMoney == -1) {
            System.out.println("Unfortunately, there are not enough funds on your account." +
                    "You need $" + (fullTicketPrice - accountSum) + ".");
        }
    }
}
