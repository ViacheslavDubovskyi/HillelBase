package org.hillel.lessons.lessonfive;

public class LessonFive {

    public static void main(String[] args) {

        int countTicket = 6;
        int passengerCount = 7;

        System.out.println("AvailableTickets = " + countTicket);
        System.out.println("Passengers = " + passengerCount);

        int checkResult = checkAvailableTickets(countTicket, passengerCount);
        printInformation(checkResult);

        String name = "Alex";
        System.out.println("Name = " + name);

        name = null;

        boolean result = checkName(name);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean checkName(String name) {
        String nameAlex = "Alex";
        System.out.println("NameAlex = " + nameAlex);
        if (nameAlex.equals(name)) { // nameAlex.equals (null) - (если значение известно, стараться писать первым)
            return true;
        } else {
            return false;
        }
    }

    public static void printInformation(int result) {
        if (result == 1) {
            System.out.println("We have enough tickets");
            return;
        }
        if (result == -1) {
            System.out.println("We don't have enough tickets");
            return;
        }
        System.out.println("Count tickets equals count of passengers");
    }

    public static int checkAvailableTickets(int ticketCount, int passengerCount) {
        if (ticketCount > passengerCount) {
            return 1;
        }
        if (ticketCount == passengerCount) {
            return 0;
        }
        return -1;
    }
}
