package org.hillel.lessons.bookLibrary;

public class LessonFourteen {

    public static void main(String[] args) {

        Horse.surname = "Horse";

        Horse horseOne = new Horse("Horse one", 10, "Red");
        Horse horseFour = new Horse("Horse four", 25, "Brown");
        Horse horseFive = new Horse("Horse five", 30, "Yellow");
        Horse horseTwo = new Horse("Horse two", 15, "Black");
        Horse horseThree = new Horse("Horse three", 20, "White");

        Horse horseSix = new Horse(horseFive);
        horseSix.setName("New name");
        horseOne.setAge(5);
//        horseSix.name = "Horse Six";
//
//        System.out.println(horseOne);
//        System.out.println(horseTwo);
//        System.out.println(horseThree);
//
//        horseOne.printGreetings();
//        horseTwo.printGreetings();
//        horseThree.printGreetings();
//
//        horseOne.printStaticGreetings();
//        horseTwo.printStaticGreetings();
//        horseThree.printStaticGreetings();
//        Horse.printStaticGreetings();

        Horse[] horses = new Horse[6];
        horses[0] = horseOne;
        horses[1] = horseTwo;
        horses[2] = horseThree;
        horses[3] = horseFour;
        horses[4] = horseFive;
        horses[5] = horseSix;

        for (int i = 0; i < horses.length; i++) {
            Horse horse = horses[i];
            System.out.println("Name = " + horse.getName() + "; age = " + horse.getAge() + "; color = " + horse.getColor());
        }
    }
}
