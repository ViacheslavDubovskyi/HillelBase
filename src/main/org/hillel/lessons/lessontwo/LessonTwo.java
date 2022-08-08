package org.hillel.lessons.lessontwo;

public class LessonTwo {
    public static void main(String[] args) {

        int testInt = 0;
        long testLong = 333333;

        System.out.println("Test long = " + testLong);

        testInt = (int) testLong;
        System.out.println("Test int = " + testInt);

        short testShort = 0;
        testShort = (short) testInt;
        System.out.println("Test short = " + testShort);
    }

}
