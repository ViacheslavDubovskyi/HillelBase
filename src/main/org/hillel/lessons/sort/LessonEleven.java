package org.hillel.lessons.sort;

import java.util.Arrays;

public class LessonEleven {
    public static void main(String[] args) {

        int[] array1 = {-1, 22, 0, 9, -66, 4, 1, 99, 7, -7};
        int[] digits = {1, 5, 56, 6};


        mergeArrays(digits, array1);

//     mergeArrays(digits, new int[]{0, 1, 2, 3, 4});

//     max(array1);
//     min(array1);

//     linearSearch(array1, 4);
//     binarySearch(array1, 4);
    }

    public static void mergeArrays(int[] source, int[] target) {
        int[] mergedArray = new int[source.length + target.length];

//      copy(source, mergedArray);

        for (int i = 0; i < source.length; i++) {
            mergedArray[i] = source[i];
        }
        for (int i = 0; i < target.length; i++) {
            mergedArray[source.length + i] = target[i];
        }
        System.out.println(Arrays.toString(mergedArray));
    }

    public static void copy(int[] source, int[] target) {
        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
    }

    public static int binarySearch(int[] array, int elementToSearch) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int iterator = 0;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            iterator++;

            int middleIndex = (firstIndex + lastIndex) / 2;
            System.out.println("middle = " + middleIndex);

            if (array[middleIndex] == elementToSearch) {
                System.out.println("index = " + middleIndex);
                System.out.println("iterator = " + iterator);
                return middleIndex;
            } else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void linearSearch(int[] array, int elementToSearch) {
        int iterator = 0;
        for (int i = 0; i < array.length; i++) {
            iterator++;
            if (array[i] == elementToSearch) {
                System.out.println("index = " + i);
                break;
            }
        }
        System.out.println("iteration = " + iterator);
    }

    public static void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
    }

    public static void min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
    }
}

// int... target - аргумент (параметр) переменной длины
// mergeArrays(digits, 1, 2, 3, 4, 5);