package org.hillel.lessons.stringBuilder;

public class LessonSix {
    public static void main(String[] args) {

        String str1 = "CatCat";
        String str2 = "Cat";
        String str3 = "Cat" + str2;

        String str5 = new String("Cat").intern();

        System.out.println(str1);
        System.out.println(str3);

        System.out.println(str1 == str3);

    }
}
