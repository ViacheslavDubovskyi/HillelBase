package org.hillel.lessons.lessonfive;

public class LessonFiveAdditional {

    public static void main(String[] args) {

        int countTest = 0;

        String name = null;

        //Для объектов для начала нужна проверка на null

        if ((name != null && checkAvailableTickets(name) && checkAvailableFunds(name))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static boolean checkAvailableTickets(String name) {
        System.out.println("Check available tickets" + name.toLowerCase());
        return false;
    }

    private static boolean checkAvailableFunds(String name) {
        System.out.println("Check available funds" + name.toUpperCase());
        return true;
    }
}
