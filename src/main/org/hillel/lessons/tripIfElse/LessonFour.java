package org.hillel.lessons.tripIfElse;

public class LessonFour {
    public static void main(String[] args) {

        double accountSumm = 100;
        double ticketPrice = 250;

        if (accountSumm > ticketPrice) {
            System.out.println("Ok");

        } else if (accountSumm == ticketPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Можно создать и использовать переменную, если она в том же блоке
        // if (accountSumm>ticketPrice) {
        //     System.out.println("Ok");
        //     int count = 10;
        //     if accountSumm<ticketPrice {
        //     count++
        //     }

        // Аналогичная запись
        String result = (accountSumm>ticketPrice) ? "Ok" : ((accountSumm==ticketPrice) ? "Yes" : "No");
        System.out.println(result);

        printText("Test");
    }
    public static void printText (String text){
        if (!text.isEmpty())
            System.out.println("Text = " + text);
    }
}
