package org.hillel.lessons.tasksonsob;

public class booleanAnd {

    private String name;

    public static void main(String[] args) {

        booleanAnd solution = new booleanAnd();

        if (solution!=null && "NAME".equals(solution.getName())){
            System.out.println("Finish");
        }

        if (solution.methodOne(5) && solution.methodTwo(20)) {
            System.out.println("Finish");
        }

    }

    public String getName() {
        return name;
    }

    private boolean methodOne (int one){
        System.out.println("Method One");
        return one > 10; // если one > 10 то true
    }

    private boolean methodTwo (int two) {
        System.out.println("Method Two");
        return two > 10; // если two > 10 то true
    }

}
