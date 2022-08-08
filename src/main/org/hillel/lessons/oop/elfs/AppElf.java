package org.hillel.lessons.oop.elfs;

import java.util.Scanner;

public class AppElf {

    UsualElf usualElfOne = new UsualElf("Tranduil", "man", 440, 2.1, 140, 40);
    UsualElf usualElfTwo = new UsualElf("Golodriel", "woman", 250, 1.9, 130, 60);
    UsualElf usualElfThree = new UsualElf("Keleborn", "man", 520, 2.3, 180, 35);

    ArcherElf archerElfOne = new ArcherElf("Idril", "woman", 330, 2.2, 150, 40, "Hawkeye bow", 25);
    ArcherElf archerElfTwo = new ArcherElf("Legolas", "man", 380, 2.4, 200, 15, "High solar bow", 40);

    SwordElf swordElfOne = new SwordElf("Haldir", "man", 480, 2.0, 160, 80, "Thunderbolt sword", 100);

    ArcherDwarf archerDwarfOne = new ArcherDwarf("Robert", "man", 40, 1.8, 120, 25, "Nice bow", 20);
    SwordDwarf swordDwarfOne = new SwordDwarf("Selina", "woman", 38, 1.7, 110, 70, "Long sword", 90);

    UsualElf[] usualElves = new UsualElf[]{usualElfOne, usualElfTwo, usualElfThree};
    ArcherElf[] archerElves = new ArcherElf[]{archerElfOne, archerElfTwo};
    SwordElf[] swordElves = new SwordElf[]{swordElfOne};
    Dwarf[] dwarves = {archerDwarfOne, swordDwarfOne};

    Warriors[] warriors = {usualElfOne, usualElfTwo, usualElfThree, archerElfOne, archerElfTwo, swordElfOne, archerDwarfOne, swordDwarfOne};

    public void printWarriorsDefence(Warriors... warriors) {
        for (Warriors person : warriors) {
            person.defend();
        }
    }

    public void printWarriorsAttack(Warriors... warriors) {
        for (Warriors person : warriors) {
            person.attack();
        }
    }

    public void printUsualElfInfo(UsualElf... usualElves) {
        for (UsualElf elf : usualElves) {
            elf.printGreetingsUsualElf();
            elf.damage();
            System.out.println();
        }
    }

    public void printArcherElfInfo(ArcherElf... archerElves) {
        for (ArcherElf elf : archerElves) {
            elf.printGreetingsArcherElf();
            elf.damage();
            System.out.println();
        }
    }

    public void printSwordElfInfo(SwordElf... swordElves) {
        for (SwordElf elf : swordElves) {
            elf.printGreetingsSwordElf();
            elf.damage();
            System.out.println();
        }
    }

    public void printArcherDwarfInfo(Dwarf... dwarves) {
        for (Dwarf dwarf : dwarves) {

            if (dwarf instanceof ArcherDwarf) {
                ((ArcherDwarf) dwarf).printGreetingsArcherDwarf();
                dwarf.damage();
                System.out.println();
            }

            if (dwarf instanceof SwordDwarf) {
                ((SwordDwarf) dwarf).printGreetingsSwordDwarf();
                dwarf.damage();
                System.out.println();
            }
        }
    }

    public void getAttackIfJumpAndRun(Warriors... warriors) {
        for (Warriors person : warriors) {

            if (person instanceof Jumpable & person instanceof FastRunnable) {
                person.attack();
            }
        }
        System.out.println();
    }

    public void getRunPerson(Warriors... warriors) {
        for (Warriors person : warriors) {

            if (person instanceof FastRunnable & !(person instanceof Jumpable)) {
                ((FastRunnable) person).runFast();
            }
        }
        System.out.println();
    }

    public void getJumpPerson(Warriors... warriors) {
        for (Warriors person : warriors) {

            if (person instanceof Jumpable & !(person instanceof FastRunnable)) {
                ((Jumpable) person).toJump();
            }
        }
        System.out.println();
    }

    public int getUserData(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }
}
