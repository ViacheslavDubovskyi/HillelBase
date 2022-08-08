package org.hillel.lessons.classObject;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        exampleEqualseAndHashcode();

//        Object o = new Object();
//        try {
//            synchronized (o) {
//                o.wait(5000);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        while (true) {
//            new Employee("Den", 27, "lonzhansky@gmai.com");
//        }
    }

    public static void exampleEqualseAndHashcode() throws CloneNotSupportedException {
        Employee employee1 = new Employee("Den", 27, "lonzhansky@gmail.com");
        employee1.setCar(new Car("Mercedes"));
        Employee employee4 = employee1.clone();
        System.out.println(employee1);

        Employee employee2 = employee1.clone();
        System.out.println(employee2);

        employee2.getCar().setName("Audi");
        employee2.setName("Oleg");

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println(employee1.equals(employee2));

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());


        Developer developer1 = new Developer("Den", 27, "lonzhansky@gmail.com", "Java Developer");
//        Developer developer2 = developer1.clone();

        System.out.println(developer1);
//        System.out.println(developer2);
    }

    public static void strExample() {
        String st1 = "A";
        String st2 = "A";

        StringBuilder strb1 = new StringBuilder(st1);
        StringBuilder strb2 = new StringBuilder(st2);

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(strb1.hashCode());
        System.out.println(strb2.hashCode());
    }
}
