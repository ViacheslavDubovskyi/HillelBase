package org.hillel.lessons.multiArray;

public class LessonTwelve {

    public static void main(String[] args) {

        int[] array = {2, 27, 4, 56, 1, 4, -7, 13, -21, 0};

        int[] array1 = {2, 3, 4, 5, 12, 25, 35, 40, 43, 50};
        int left = 0;
        int right = array.length - 1;
        int pivot = 0;
        int target = 43;

        while (left <= right) {
            pivot = (right - left) / 2;
            if (array1[pivot] == target) {
                break;
            }
            if (array1[pivot] > target) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        System.out.println(pivot);

        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        System.out.println(minElement);
    }
}
