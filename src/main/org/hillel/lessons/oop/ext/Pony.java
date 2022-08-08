package org.hillel.lessons.oop.ext;

public class Pony extends Horse {

    private int sizeLimit;

    public Pony(String name, int age, int sizeLimit) {
        super.name = name;
        super.age = age;
        this.sizeLimit = sizeLimit; //pony
    }

    private void printHorse() {
        System.out.println(name + age + sizeLimit);
    }
}

//    public Pony(String name, int age, int sizeLimit) {
//        super(name, age); // = new Horse("Horse One", 50)
//        this.sizeLimit = sizeLimit; //pony
//    }

//super.name = name; //horse
//super.age = age; //horse