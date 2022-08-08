package org.hillel.lessons.classObject;

import java.util.Objects;

public class Developer extends Employee{

    private String position;

    public Developer(String name, int age, String email, String position) {
        super(name, age, email);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

//    @Override
//    protected Developer clone() throws CloneNotSupportedException {
//        return (Developer) super.clone();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return Objects.equals(position, developer.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), position);
    }

    @Override
    public String toString() {
        return super.toString() + " {" +
                "position='" + position + '\'' +
                '}';
    }
}
