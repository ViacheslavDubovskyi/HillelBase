package org.hillel.lessons.oop.elfs;

public class ArcherDwarf extends Dwarf{

    private String bow;
    private int bowPower;

    public ArcherDwarf(String name, String gender, int age, double height, int power, int defence, String bow, int bowPower) {
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
        System.out.println("Archer dwarf " + name + " attacks!");
        damage();
    }

    @Override
    public void defend() {
        System.out.println("Archer Elf " + name + " in defence");
        super.defend();
    }

    private void archerAbility() {
        System.out.println("I can shoot with a bow. I own the " + bow + ", its power is " + bowPower);
    }

    public void printGreetingsArcherDwarf() {
        super.printGreetings();
        archerAbility();
    }
}
