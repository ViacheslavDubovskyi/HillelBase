package org.hillel.lessons.oop.elfs;

public class Elf extends Warriors {

    protected String name;
    protected String gender;
    protected int age;
    protected double height;
    protected int power;
    protected int defence;

    public Elf(String name, String gender, int age, double height, int power, int defence) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.power = power;
        this.defence = defence;
    }

    @Override
    public void attack() {
        damage();
    }

    @Override
    public void defend() {
        System.out.println("Defence with " + defence + " power");

    }
    @Override
    public void damage() {
        System.out.println("Damage: " + power);
    }

    public void printGreetings() {
        System.out.println("Hello! My name is: " + name +
                ", gender: " + gender +
                ", age = " + age +
                ", height = " + height +
                " power: " + power +
                " defence: " + defence);
    }
}
