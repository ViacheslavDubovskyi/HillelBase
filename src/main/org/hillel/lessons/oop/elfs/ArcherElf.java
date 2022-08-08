package org.hillel.lessons.oop.elfs;

public class ArcherElf extends Elf implements FastRunnable {

    private String bow;
    private int bowPower;

    public ArcherElf(String name, String gender, int age, double height, int power, int defence, String bow, int bowPower) {
        super(name, gender, age, height, power, defence);
        this.bow = bow;
        this.bowPower = bowPower;
    }

    @Override
    public void damage() {
        int hit = power + bowPower;
        System.out.println("Total power of the strike: " + hit);
    }

    @Override
    public void attack() {
        System.out.println("Archer Elf " + name + " attacks!");
        damage();
    }

    @Override
    public void defend() {
        System.out.println("Archer Elf " + name + " in defence");
        super.defend();
    }

    @Override
    public void runFast() {
        System.out.println("I am archer elf " + name + " and I start run fast");
    }

    private void archerAbility() {
        System.out.println("I can shoot with a bow. I own the " + bow + ", its power is " + bowPower);
    }

    public void printGreetingsArcherElf() {
        super.printGreetings();
        archerAbility();
    }
}
