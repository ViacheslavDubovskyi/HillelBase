package org.hillel.lessons.intfce;

public class Airplane extends Plane implements Flyable, Jumpable{

    public String nameAirplane;
    private State status;

    public State getStatus() {
        return status;
    }

    public void setStatus(State status) {
        this.status = status;
    }

    @Override
    public void toFly() {
        System.out.println("I am just plane");
    }

    public void printNotFly(){
        System.out.println("Not Fly!");
    }

    @Override
    public void fly() {
        System.out.println("I am plane and I can fly");
    }

    @Override
    public void toJump() {
        System.out.println("I am plane I cannot jump");
    }
}
