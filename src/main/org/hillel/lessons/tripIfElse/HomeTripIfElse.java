package org.hillel.lessons.tripIfElse;

public class HomeTripIfElse {

    public static void main(String[] args) {

        double ticketPriceToFlorence = 115.45;
        double ticketPriceToRome = 130.25;
        double ticketPriceToPalermo = 95.75;
        int countPassengers = 3;
        double additionalCost = 80.88;
        double accountSumm = 600.55;

        String cityFlorence = "Флоренция";
        String cityRome = "Рим";
        String cityPalermo = "Палермо";

        int countTicketsToFlorence = 3;
        int countTicketsToRome = 4;
        int countTicketsToPalermo = 2;

        printGreetings("Yunona");
        System.out.println("Количество пассажиров: " + countPassengers);
        System.out.println("Сумма на Вашем аккаунте: " + accountSumm);
        System.out.println();

        printList(cityFlorence, ticketPriceToFlorence, countTicketsToFlorence);
        printList(cityRome, ticketPriceToRome, countTicketsToRome);
        printList(cityPalermo, ticketPriceToPalermo, countTicketsToPalermo);
        System.out.println();

        int availiableTicketsToFlorence = checkCountTickets(countTicketsToFlorence, countPassengers);
        double totalPricetoFlorence = getFullPriceToCity(ticketPriceToFlorence, additionalCost, countPassengers);
        System.out.println("Полная стоимость путешествия во Флоренцию: " + totalPricetoFlorence);
        printAvailableTickets(availiableTicketsToFlorence, countTicketsToFlorence, countPassengers);
        double availiableAccountSumToFlorence = checkAccountSumm(accountSumm, totalPricetoFlorence);
        printCheckAccountSumm((int) availiableAccountSumToFlorence, accountSumm, totalPricetoFlorence);
        printCheckTickets(accountSumm, totalPricetoFlorence, countTicketsToFlorence, countPassengers);
        System.out.println();

        int availiableTicketsToRome = checkCountTickets(countTicketsToRome, countPassengers);
        double totalPricetoRome = getFullPriceToCity(ticketPriceToRome, additionalCost, countPassengers);
        System.out.println("Полная стоимость путешествия в Рим: " + totalPricetoRome);
        printAvailableTickets(availiableTicketsToRome, countTicketsToRome, countPassengers);
        double availiableAccountSumToRome = checkAccountSumm(accountSumm, totalPricetoRome);
        printCheckAccountSumm((int) availiableAccountSumToRome, accountSumm, totalPricetoRome);
        printCheckTickets(accountSumm, totalPricetoRome, countTicketsToRome, countPassengers);
        System.out.println();

        int availiableTicketsToPalermo = checkCountTickets(countTicketsToPalermo, countPassengers);
        double totalPricetoPalermo = getFullPriceToCity(ticketPriceToPalermo, additionalCost, countPassengers);
        System.out.println("Полная стоимость путешествия в Палермо: " + totalPricetoPalermo);
        printAvailableTickets(availiableTicketsToPalermo, countTicketsToPalermo, countPassengers);
        double availiableAccountSumToPalermo = checkAccountSumm(accountSumm, ticketPriceToPalermo);
        printCheckAccountSumm((int) availiableAccountSumToPalermo, accountSumm, totalPricetoPalermo);
        printCheckTickets(accountSumm, totalPricetoRome, countTicketsToRome, countPassengers);
        System.out.println();

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

    public static void printGreetings(String name) {
        System.out.println("Hello, " + name);
        System.out.println("Welcome to our agency");
        System.out.println("Please, choose the direction");
        System.out.println();
    }

    public static void printList(String city, double ticketPrice, int countTickets) {
        System.out.println("Стоимость билета по направлению " + city + ": " + ticketPrice);
        System.out.println("Количество доступных билетов: " + countTickets);
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

    public static int checkCountTickets(int countTickets, int countPassengers) {
        if (countTickets > countPassengers) {
            return 1;
        }
        if (countTickets < countPassengers) {
            return -1;
        }
        return 0;
    }

    public static void printAvailableTickets(int countTickets, int totalTickets, int countPassengers) {
        if (countTickets == 1) {
            System.out.println("Количество билетов больше количества пассажиров. " +
                    "Остаток билетов: " + ((totalTickets) - countPassengers));
        } else if (countTickets == 0) {
            System.out.println("Количество билетов равно количеству пассажиров. " +
                    "Останется " + ((totalTickets) - countPassengers) + " свободных билетов");
        } else {
            System.out.println("Количество билетов меньше количества пассажиров. " +
                    "Еще необходимо " + (countPassengers - totalTickets) + " билет(ов)");
        }
    }

    public static double getFullPriceToCity(double ticketPrice, double addPrice, int countPassengers) {
        double fullPrice = calculateFullPrice(countPassengers, ticketPrice);
        double additionalPrice = calculateAdditionalCost(countPassengers, addPrice);
        return calculateTotalPrice(fullPrice, additionalPrice);
    }

    public static void printCheckAccountSumm(int checkSumm, double accountSumm, double ticketPrice) {
        if (checkSumm == 1) {
            System.out.println("Средств достаточно");
            System.out.println("На остатке после покупки: " + ((accountSumm) - ticketPrice));
        } else if (checkSumm == 0) {
            System.out.println("Денег ровно хватает");
        } else {
            System.out.println("Недостаточно средств");
            System.out.println("Еще необходимо " + (ticketPrice - accountSumm) + " денег");
        }
    }

    private static void printCheckTickets(double accountSumm, double ticketPrice, int countTickets, int countPassengers) {
        if ((checkAccountSumm(accountSumm, ticketPrice) >= 0) && (checkCountTickets(countTickets, countPassengers) >= 0)) {
            System.out.println("Покупка возможна");
        } else {
            System.out.println("Покупка невозможна");
        }
    }
}

