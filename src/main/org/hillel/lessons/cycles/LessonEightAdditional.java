package org.hillel.lessons.cycles;

import java.util.Scanner;

public class LessonEightAdditional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Input ticket count: ");
            int ticketCount = getIntegerUserDataFromConsole(scanner);
        }
    }

    public static int getIntegerUserDataFromConsole(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        return -1;
    }
}

