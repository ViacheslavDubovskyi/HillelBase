package org.hillel.lessons.bookLibrary;

public class Horse {

    private String name;

    private int age;

    private String color;

    public static String surname;

    public Horse(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void incAge() {
        age++;
    }

    public void setAge(int age) {
        if (age < this.age) {
            return;
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // конструктор копирования
    public Horse(Horse horse) {
        name = horse.name;
        age = horse.age;
        color = horse.color;
    }

    public void printGreetings() {
        System.out.println("Hello, I am " + name + " " + surname);
    }

    private static void printStaticGreetings() {
        System.out.println("Hello " + surname);
    }
}
