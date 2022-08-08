package org.hillel.lessons.arrayfirst;

public class LessonNine {

    public static void main(String[] args) {
        int[] array = new int[10];
        String[] cities = new String[5];
        boolean[] booleans = new boolean[5];

        array[5] = 7;
        array[3] = 1;
        array[0] = 6;

        String cityFlorence = "Florence";
        String cityRome = "Rome";
        String cityPalermo = "Palermo";
        cities[0] = cityFlorence;
        cities[1] = cityRome;
        cities[2] = cityPalermo;

        String[] citiesTwo = new String[]{cityFlorence,cityRome, cityPalermo};
        String[] citiesThree = {"Florence", "Rome", "Palermo"};

        for ( int i = 0; i < citiesTwo.length; i++) {
            System.out.println(citiesTwo[i]);
        }

//      for (int i = 0; i < array.length; i++) {
//          array[i] = 9;
//      }

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            System.out.println("i = " + i + ", array[" + i + "] = " + element);
        }

        System.out.println();

        for (int element : array) {
            System.out.print(" " + element);
        }
    }
}

