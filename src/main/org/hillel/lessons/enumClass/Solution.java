package org.hillel.lessons.enumClass;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hillel.lessons.enumClass.HealthState.*;

public class Solution {

    public static void main(String[] args) {

        Gnome gnomeOne = new Gnome(100);
        Gnome gnomeTwo = new Gnome(100);

        ElfArcher elfArcherOne = new ElfArcher(100);
        ElfArcher elfArcherTwo = new ElfArcher(100);

        ArrayList<Warrior> armyGnome = new ArrayList<>(Arrays.asList(gnomeOne, gnomeTwo));
        ArrayList<Warrior> armyElf = new ArrayList<>(Arrays.asList(elfArcherOne, elfArcherTwo));
        ElfArcher elfArcherThree = new ElfArcher(100);
        armyElf.add(elfArcherThree);
        Gnome gnomeThree = new Gnome(100);
        armyGnome.add(gnomeThree);

        Solution solution = new Solution();

        solution.initArmy(new ArrayList<>(Arrays.asList(gnomeOne, gnomeThree, elfArcherOne, elfArcherTwo)));
        solution.battle(armyGnome, armyElf);

        solution.print(new ArrayList<>(Arrays.asList(gnomeOne, gnomeThree, elfArcherOne, elfArcherTwo)));
    }

    private void print(ArrayList<Warrior> warriorArrayList) {
        for (Warrior warrior : warriorArrayList) {
            System.out.println(warrior);
        }
    }

    private void battle(ArrayList<Warrior> gnomes, ArrayList<Warrior> elves) {
      //  for (int j = 0; j < 10; j++) {
            for (int i = 0; i < gnomes.size(); i++) {
                Warrior warriorOne = gnomes.get(i);
                Warrior warriorTwo = elves.get(i);
                fight(warriorOne, warriorTwo);
                fight(warriorTwo, warriorOne);
          //  }
        }
    }

    private void fight(Warrior warriorOne, Warrior warriorTwo) {
        int attackLevel = 0;

        if (warriorOne.getHealthState() != DEAD && warriorOne instanceof Attackable) {
            attackLevel = ((Attackable) warriorOne).attack();
        }
        if (warriorTwo.getHealthState() != DEAD && warriorTwo instanceof Defencable) {
            ((Defencable) warriorTwo).defence(attackLevel);
        }
    }

    private void initArmy(ArrayList<Warrior> warriors) {
        for (Warrior warrior : warriors) {
            warrior.initDefenceLevel();
            warrior.initForceLevel();

        }
    }
}


//        State[] values = State.values();
//        for (State status : values) {
//            System.out.println("" + status + " = " + status.ordinal());
//        }
//
//        State ok = State.valueOf("OK");
//        System.out.println(ok);
//        Elf elf = new Elf(State.OK);
//
//        if (elf.getStatus() == State.OK) {
//            System.out.println("I'm fine");
//        } else {
//            System.out.println("I'm done");
//        }