package org.hillel.lessons.multiArray;

import java.util.Arrays;

public class HomeMultiArray {

    public static void main(String[] args) throws InterruptedException {

        String[][] array = new String[15][15];

        fillArrayByPoints(array);
        printArray(array);

        fillLinesByPlus(array);
        printArray(array);

        int iteration = 0;
        while (iteration < 20) {
            printLeft(array);
            Thread.sleep(500);
            printTop(array);
            Thread.sleep(500);
            printRight(array);
            Thread.sleep(500);
            printBottom(array);
            Thread.sleep(500);
            iteration++;
        }
    }

    public static void printBottom(String[][] array) {
        fillBottomTriangle(array, "+");
        printArray(array);
        fillBottomTriangle(array, ".");
    }

    public static void printRight(String[][] array) {
        fillRightTriangle(array, "+");
        printArray(array);
        fillRightTriangle(array, ".");
    }

    public static void printTop(String[][] array) {
        fillTopTriangle(array, "+");
        printArray(array);
        fillTopTriangle(array, ".");
    }

    public static void printLeft(String[][] array) {
        fillLeftTriangle(array, "+");
        printArray(array);
        fillLeftTriangle(array, ".");
    }

    public static void fillBottomTriangle(String[][] array, String value) {
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = array.length - i; j < i; j++) {
                array[i][j] = value;
            }
        }
    }

    public static void fillRightTriangle(String[][] array, String value) {
        for (int i = 1; i < array.length / 2; i++) {
            for (int j = array.length - i; j < array.length; j++) {
                array[i][j] = value;
            }
        }
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                array[i][j] = value;
            }
        }
    }

    public static void fillTopTriangle(String[][] array, String value) {
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i + 1; j < array.length - i - 1; j++) {
                array[i][j] = value;
            }
        }
    }

    public static void fillLeftTriangle(String[][] array, String value) {
        for (int i = 1; i < array.length / 2; i++) {
            for (int j = 0; j < i; j++) {
                array[i][j] = value;
            }
        }
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                array[i][j] = value;
            }
        }
    }

    public static void printArray(String[][] array) {
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fillLinesByPlus(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][array.length - 1 - i] = "+";
        }
        for (int i = 0; i < array.length; i++) {
            array[i][i] = "+";
        }
    }

    public static void fillArrayByPoints(String[][] array) {
        for (String[] strings : array) {
            Arrays.fill(strings, ".");
        }
    }
}
