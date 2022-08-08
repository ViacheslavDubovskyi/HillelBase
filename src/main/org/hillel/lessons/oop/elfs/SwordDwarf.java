package org.hillel.lessons.oop.elfs;

public class SwordDwarf extends Dwarf{

    private String sword;
    private int swordPower;

    public SwordDwarf(String name, String gender, int age, double height, int power, int defence, String sword, int swordPower) {
        super(name, gender, age, height, power, defence);
        this.sword = sword;
        this.swordPower = swordPower;
    }

    @Override
    public void attack() {
        System.out.println("Sword Dwarf " + name + " attacks!");
        damage();
    }

    @Override
    public void defend() {
        System.out.println("Sword Dwarf " + name + " in defence");
        super.defend();
    }

    @Override
    public void damage() {
        int hit = power + swordPower;
        System.out.println("Total power of the strike: " + hit);
    }

    private void swordAbility() {
        System.out.println("I can fight with a sword. I own the " + sword + ", its power is " + swordPower);
    }

    public void printGreetingsSwordDwarf() {
        super.printGreetings();
        swordAbility();
    }
}
