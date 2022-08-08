package org.hillel.lessons.lessonthree;

public class MinMaxValue {

    public static void main(String[] args) {

        byte minValueB = Byte.MIN_VALUE;
        byte maxValueB = Byte.MAX_VALUE;

        short minValueS = Short.MIN_VALUE;
        short maxValueS = Short.MAX_VALUE;

        int minValueI = Integer.MIN_VALUE;
        int maxValueI = Integer.MAX_VALUE;

        long minValueL = Long.MIN_VALUE;
        long maxValueL = Long.MAX_VALUE;

        minValueB = Byte.MIN_VALUE;
        maxValueB = Byte.MAX_VALUE;
        long minValue = minValueB;
        long maxValue = maxValueB;

        printMinMaxValue("byte", minValue, maxValue);
        printMinMaxValue("short", Short.MIN_VALUE, Short.MAX_VALUE);
        printMinMaxValue("int", Integer.MIN_VALUE, Integer.MAX_VALUE);
        printMinMaxValue("long", Long.MIN_VALUE, Long.MAX_VALUE);

    }

    public static void printMinMaxValue (String type, long minValue, long maxValue) {
        System.out.println("Minimum value for " + type + " type is " + minValue);
        System.out.println("Maximum value for " + type + " type is " + maxValue);
    }
}
