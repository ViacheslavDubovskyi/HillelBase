package org.hillel.lessons.scannerswitch;

import java.util.Scanner;

public class LessonSevenAdditional {

    public Scanner scanner;

    public static void main(String[] args) {


        LessonSevenAdditional lessonSevenAdditional = new LessonSevenAdditional();
        lessonSevenAdditional.scanner = new Scanner(System.in);

        System.out.println("Hello");
        System.out.println("Input your name : ");
        String name = lessonSevenAdditional.getUserData();
        System.out.println("Hello " + name);

        System.out.println("Input ticket count: ");
        //int ticketCount = getIntUserData(scanner);
        int ticketCount = lessonSevenAdditional.getIntegerUserDataFromConsole();
        if (ticketCount > 0) {
            System.out.println("Hello " + name + " you need" + ticketCount + " tickets");
        } else {
            System.out.println("You input incorrect data");
        }

        final String cityRome = "Rome";
        final String cityParis = "Paris";
        final String cityBerlin = "Berlin";
        //final - обозначение константы. Для const нельзя менять значение

        System.out.println("Input direction (" + cityBerlin + ", " +
                cityParis + ", " + cityRome + ")");
        String direction = lessonSevenAdditional.getUserData();

        // direction = direction.toLowerCase(Locale.ROOT);
        // для switch case нужны константы

        switch (direction) {
            case "Berlin":
                System.out.println("Input is Berlin");
                break;
            case "Rome":
                System.out.println("Input is Rome");
                break;
            case "Paris":
                System.out.println("Input is Paris");
                break;
            default:
                System.out.println("Incorrect city");
                break;
        }

        // int result = checkTicket(); можно сразу подставить параметр в метод

        switch (checkTicket()) {
            case -1:
                System.out.println("Not enough tickets");
                break;
            case 1:
                System.out.println("Yes");
                break;
            case 0:
                System.out.println("Rest of the tickets 0");
                break;
            default:
                break;
        }

        lessonSevenAdditional.scanner.close();
    }

    private static int checkTicket() {
        return 0;
    }

    public String getUserData() {
        return scanner.next();
    }

    public int getIntUserData() { // в крайнем случае, если нужно скрыть ошибку
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception exception) {
            return -1;
        }
    }

    public int getIntegerUserDataFromConsole() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        return -1;
    }
}
