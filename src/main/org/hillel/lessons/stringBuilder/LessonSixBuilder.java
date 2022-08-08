package org.hillel.lessons.stringBuilder;

public class LessonSixBuilder {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Caat!"); // c - 0, a - 1, t - 2, ! - 3

        //stringBuilder.delete(3,4);
        //stringBuilder.deleteCharAt(3);
        //stringBuilder.replace(0,1,"Dog ");
        //stringBuilder.insert(0, "Dog");
        stringBuilder.append("Dog");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.indexOf("C"));
        System.out.println(stringBuilder.lastIndexOf("a"));
        System.out.println(stringBuilder.reverse());

        String str = stringBuilder.toString();

    }
}
