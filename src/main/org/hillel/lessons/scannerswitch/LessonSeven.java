package org.hillel.lessons.scannerswitch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LessonSeven {

    public static void main(String[] args) throws FileNotFoundException {

        readFile();

        System.exit (0);

        String textString = "Hello1 Hello2 Hello3";
        readString(textString);

        Scanner scanner = new Scanner(System.in);
        String nameOne = scanner.next();

        System.out.println("Input your name :");
        String name = scanner.next();
        System.out.println("Dear " + name + ".Hello!");

        System.out.println("Input direction : ");
        String direction = scanner.next();
        System.out.println("Dear " + name + ", your direction is : " + direction);

        scanner.close();
    }

    public static void readString (String testString){
        Scanner scannerText = new Scanner(testString);
        Scanner scannerConsole = new Scanner(System.in);

        String text = scannerText.next();
        System.out.println(text);
        String textConsole = scannerConsole.next ();
        System.out.println("" + text + " " + textConsole);

        text = scannerText.next();
        System.out.println(text);

        text = scannerText.next();
        System.out.println(text);

        scannerText.close();
    }

    public static void readFile () throws FileNotFoundException {
        Scanner scannerFile = new Scanner(new File("D:/test.txt"));
        while (scannerFile.hasNext()){
            String textFromFile = scannerFile.next();
            System.out.println(textFromFile);
        }
        scannerFile.close();
    }
}
