package org.hillel.lessons.tasksonsob;

import java.util.Arrays;

public class StringReverse {

    public static void main(String[] args) {

        String s = "asdsrhddfjrgfsdsd";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;

        while (left<right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        System.out.println(s);
        System.out.println(Arrays.toString(chars));

    }

//    StringBuilder stringBuilder = new StringBuilder(s);
//    String string = stringBuilder.reverse().toString();

}
