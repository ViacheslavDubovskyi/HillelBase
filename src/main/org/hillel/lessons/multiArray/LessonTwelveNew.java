package org.hillel.lessons.multiArray;

public class LessonTwelveNew {

    public static void main(String[] args) {

        int[][] array = new int[5][5];
        String[][] strings = new String[5][5];

        fillArray(strings);
        printArray(array);
        printArray(strings);

        for (int i = 0; i < strings.length; i++) {
            strings[i][i] = "1";
        }
        printArray(strings);

//        0  4
//        1  3
//        2  2    ===>
//        3  1
//        4  0

        for (int i = 0; i < strings.length; i++) {
            strings[i][array.length - 1 - i] = "0";
        }
        printArray(strings);

    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________");
    }

    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________");
    }

    public static void fillArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) { // можно вызвать метод fill в классе Array
                array[i][j] = ".";                      // Arrays.fill(array[i], ".");
            }
        }
    }
}
