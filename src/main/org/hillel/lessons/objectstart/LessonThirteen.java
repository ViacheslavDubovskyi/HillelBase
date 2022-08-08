package org.hillel.lessons.objectstart;

import java.util.Arrays;

public class LessonThirteen {

    public static void main(String[] args) {

        int[] first = {2, 1, 5, 3};
        int[] second = {1, 2, 3, 4};
        second = first;


        System.out.println(Arrays.toString(first));
        Arrays.sort(first);
        System.out.println(Arrays.toString(first));

        String[][] strings = new String[3][3];

        for (String[] string : strings) {
            Arrays.fill(string, ".");
        }

        System.out.println(Arrays.deepToString(strings));

    }
}
