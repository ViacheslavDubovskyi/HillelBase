package org.hillel.lessons.stringBuilder;

import java.util.Scanner;

public class ToUpperCase {

    static String str;
    static String[] strings;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        str = scanner.nextLine().trim();
        scanner.close();

        //1 вариант
        strings = str.split(" ");
        for (String element : strings) {
            element = element.substring(0, 1).toUpperCase() + element.substring(1);
            System.out.print(element + " ");
        }

        System.out.println();

        //2 вариант
        String text = "This is just an example string for test";
        String newText = text.substring(0,1).toUpperCase();
        for (int i = 1; i < text.length(); i++) {
            if (" ".equals(text.substring(i-1, i))){
                newText += text.substring(i,i+1).toUpperCase();
            }
            else
                newText += text.substring(i,i+1);

        }
        System.out.println(newText);
    }
}
