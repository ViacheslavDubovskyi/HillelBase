package org.hillel.lessons.sort;

import java.util.Arrays;

public class LessonElevenSort {
    public static void main(String[] args) {

        int[] array1 = {-1, 22, 0, 9, -66, 4, 1, 99, 7, -7};
        doBubbleSort(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = {-1, 22, 0, 9, -66, 4, 1, 99, 7, -7};
        selectionSort(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = {-1, 22, 0, 9, -66, 4, 1, 99, 7, -7};
        shakingSort(array3);
        System.out.println(Arrays.toString(array3));

        int[] array4 = {-1, 22, 0, 9, -66, 4, 1, 99, 7, -7};
        shakingSortTwo(array4);
        System.out.println(Arrays.toString(array4));
    }

    public static void shakingSortTwo(int[] array) {
        int iteration = 0;
        int temp = 0;

        int leftSide = 0;
        int rightSide = array.length - 1;

        while (leftSide < rightSide) {
            iteration++;
            for (int j = leftSide; j < rightSide; j++) {
                iteration++;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            rightSide--;
            for (int j = rightSide; j > leftSide; j--) {
                iteration++;
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            leftSide++;
        }
        System.out.println("Iterations = " + iteration);
    }

    public static void shakingSort(int[] array) {
        int iteration = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            iteration++;
            // for (int j = array.length - 1; j > 0; j--)
            for (int j = 0; j < array.length - 1 - i; j++) { // отсекаем то, что проверялось
                iteration++;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            // for (int j = array.length - 1; j > 0; j--)
            for (int j = array.length - 1; j > 0; j = j - 1 - i) { // отсекаем то, что проверялось
                iteration++;
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("Iterations = " + iteration);
    }

    public static void selectionSort(int[] array) {
        int iteration = 0;
        for (int i = 0; i < array.length; i++) { //
            iteration++;
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) { // переставляем на 0 индекс (далее 1, 2 ...)
                iteration++;                             //в цикле ищем минимальный элемент
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        System.out.println("Iterations = " + iteration);
    }

    public static void doBubbleSort(int[] array) {
        int iteration = 0;
        for (int i = 0; i < array.length - 1; i++) {
            iteration++;
            // for (int j = 0; j < array.length - 1; j++)
            for (int j = 0; j < array.length - 1 - i; j++) { // отсекли то, что уже отсортировано справа
                iteration++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Iterations = " + iteration);
    }
}
