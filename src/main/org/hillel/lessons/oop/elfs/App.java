package org.hillel.lessons.oop.elfs;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        AppElf appElf = new AppElf();
        Scanner scanner = new Scanner(System.in);
        int iteration = 0;
        while (iteration < 10) {
            System.out.println("Please, enter the list of warriors: 1 - Usual Elves, 2 - Archer Elves, " +
                    "3 - Sword Elves, 4 - Dwarves, 5 - next step, 0 - exit from the system");
            String userChoice1 = String.valueOf(appElf.getUserData(scanner));
            iteration++;
            switch (userChoice1) {
                case "1":
                    appElf.printUsualElfInfo(appElf.usualElves);
                    break;
                case "2":
                    appElf.printArcherElfInfo(appElf.archerElves);
                    break;
                case "3":
                    appElf.printSwordElfInfo(appElf.swordElves);
                    break;
                case "4":
                    appElf.printArcherDwarfInfo(appElf.dwarves);
                    break;
                case "5":
                    iteration = 10;
                    continue;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Please, try again");
            }
        }

        System.out.println("Please, enter your command: 1 - Attack, 2 - Defend, 0 - exit from the system");
        String userChoice2 = String.valueOf(appElf.getUserData(scanner));
        switch (userChoice2) {
            case "1":
                appElf.printWarriorsAttack(appElf.warriors);
                break;
            case "2":
                appElf.printWarriorsDefence(appElf.warriors);
                break;
            default:
                System.out.println("Please, try again");
        }
        scanner.close();

        System.out.println();
        System.out.println("Let's go to action!");
        System.out.println();
        appElf.getAttackIfJumpAndRun(appElf.warriors);
        appElf.getRunPerson(appElf.warriors);
        appElf.getJumpPerson(appElf.warriors);
    }
}

