package org.hillel.lessons.classObject;

import java.util.Objects;

public class Employee implements Cloneable{

    private String name;
    private int age;
    private String email;
    private Car car;

    public Employee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Employee(String name, int age, String email, Car car) {
        this(name, age, email);
        this.car = car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return this.car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
//        if (o == null || !(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return age == employee.age && name.equals(employee.name) && email.equals(employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ((car != null) ? ", car=" + car : "");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroyed");
        super.finalize();
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
