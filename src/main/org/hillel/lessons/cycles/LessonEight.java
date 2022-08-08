package org.hillel.lessons.cycles;

public class LessonEight {

    public static void main(String[] args) {

        int count = 0;
        boolean isEnabled = true;
        while (isEnabled) {
            if (count == 5) {
                isEnabled = false;
            }
            System.out.println("Hello " + count);
            count++;
        }
        System.out.println();

        int fact = 1;
        int sum = 0;
        for (int i = 1; i <= 5; i++ ) {
            sum += i;
            fact *= i;
        }
        System.out.println(sum);
        System.out.println(fact);

        System.out.println();
        isEnabled = false;
        do {
            System.out.println("Hello do-while" + count);
        } while (isEnabled);


        System.out.println();
        System.out.println("Hello");

        for (int i = 0; i < 100; i++) {
            if ((i % 2) == 0) {
                continue;
            }
            System.out.println("Count = " + i);
        }

//     int count = 0;
//     while (count < 10) {
//         System.out.println("Hello " + count);
//         count++;

    }
//     for (int i = 0; i < 1000; i++) {
//         System.out.println("Count i = " + i);
//         if (i > 300) {
//             continue;
//         }
//         System.out.println("Hello " + i);
//         System.out.println("Bye " + i);
//     }

    //     for (int i = 0; i<1000; i++) {
    //         System.out.println("Hello" + i);
    //         if (i == count) {
    //             break;
    //         }
    //     }
    //     System.out.println("Bye");}
}