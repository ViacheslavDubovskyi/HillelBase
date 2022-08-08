package org.hillel.lessons.oop.elfs;

public class UsualElf extends Elf implements Jumpable{

    public UsualElf(String name, String gender, int age, double height, int power, int defence) {
        super(name, gender, age, height, power, defence);
    }

    @Override
    public void attack() {
        System.out.println("Usual Elf " + name + " attacks!");
        super.attack();
    }

    @Override
    public void defend() {
        System.out.println("Usual Elf " + name + " in defence");
        super.defend();
    }

    @Override
    public void damage() {
        super.damage();
    }

    @Override
    public void toJump() {
        System.out.println("I am usual elf " + name + " and I start jump");
    }

    public void printGreetingsUsualElf() {
        super.printGreetings();
    }
}
