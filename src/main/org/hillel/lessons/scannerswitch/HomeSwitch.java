package org.hillel.lessons.scannerswitch;

import java.util.Scanner;

public class HomeSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = getData(scanner);

        final String cityFlorence = "Florence";
        final String cityRome = "Rome";
        final String cityPalermo = "Palermo";
        final String cityMadrid = "Madrid";
        final String cityVienna = "Vienna";

        System.out.println("Здравствуйте, " + name);
        System.out.println("Введите направление. Доступно: " + cityFlorence + ", " +
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
                System.out.println("Неккоректный ввод города");
                System.exit(0);
        }

        System.out.println("Введите количество пассажиров:");
        String countPass = getData(scanner);
        int countPassengers = Integer.parseInt(countPass);

        System.out.println("Введите доступные Вам средства:");
        String countMoney = getData(scanner);
        double accountSumm = Integer.parseInt(countMoney);

        printList(direction, ticketPrice, countTickets, additionalCost);
        System.out.println();

        //double fullTicketPrice = calculateFullPrice(countPassengers, ticketPrice);
        //double fullAdditionalMoney = calculateAdditionalMoney(countPassengers, additionalCost);
        //double totalPriceOfJorney = calculateTotalPrice(fullTicketPrice, fullAdditionalMoney);

        double totalPriceOfJorney = getFullPriceToCity(ticketPrice, additionalCost, countPassengers);
        int availiableTickets = checkAvailableTickets(countTickets, countPassengers);
        int availiableMoney = checkAccountSumm(accountSumm, totalPriceOfJorney);
        System.out.println("Уважаемый(ая) " + name + "! Вы выбрали направление " + direction + ". " +
                "Количество пассажиров: " + countPassengers + ". Полная стоимость путешествия составит: $" + totalPriceOfJorney);
        printExitText(availiableTickets, availiableMoney, countTickets,
                countPassengers, accountSumm, totalPriceOfJorney);

        System.out.println();
        scanner.close();
    }

    private static String getData(Scanner scanner) {
        return scanner.next();
    }

    public static void printList(String city, double ticketPrice, int countTickets, double AdditionalCost) {
        System.out.println("Стоимость 1 билета по направлению " + city + ": $" + ticketPrice);
        System.out.println("Количество доступных билетов: " + countTickets);
        System.out.println("Расходы на путешествие на 1 человека: $" + AdditionalCost);
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

    public static int checkAccountSumm(double accountSumm, double ticketPrice) {
        if (accountSumm > ticketPrice) {
            return 1;
        }
        if (accountSumm < ticketPrice) {
            return -1;
        }
        return 0;
    }

    public static void printExitText(int availiableTickets, int availiableMoney, int countTickets,
                                     int countPassengers, double accountSumm, double fullTicketPrice) {
        if (availiableTickets >= 0 & availiableMoney >= 0) {
            System.out.println("Хотим сообщить, что покупка тура успешна! Средств и билетов достаточно. " +
                    "Остаток билетов: " + (countTickets - countPassengers) +
                    ". Остаток средств на счету: $" + (accountSumm - fullTicketPrice));
        }
        if (availiableTickets == -1 & availiableMoney == -1) {
            System.out.println("К сожалению, недостаточно билетов для покупки и средств в наличии. " +
                    "Еще необходимо " + (countTickets - countPassengers) +
                    " билетов и $" + (fullTicketPrice - accountSumm));
        }
        if (availiableTickets == -1) {
            System.out.println("К сожалению, на данный момент недостаточно билетов в наличии. " +
                    "Еще необходимо: " + (countPassengers - countTickets) + " билет(ов).");
        }
        if (availiableMoney == -1) {
            System.out.println("К сожалению, у Вас недостаточно средств. Для путешествия " +
                    "необходимо еще $" + (fullTicketPrice - accountSumm) + ".");
        }
    }
}

