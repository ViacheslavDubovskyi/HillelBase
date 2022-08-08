package org.hillel.lessons.intfce;

public class App {

    public static void main(String[] args) {

        Airplane airplane = new Airplane();
        airplane.setStatus(State.READY); // пример Enum

        if (State.NOT_READY.equals(airplane.getStatus())){
           // то выполняется определенная логика
        }

        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane();

        RocketPlane rocketPlane = new RocketPlane();
        RocketPlane rocketPlane1 = new RocketPlane();
        RocketPlane rocketPlane2 = new RocketPlane();

        Airplane[] airplanes = {airplane, airplane1, airplane2};
        RocketPlane[] rocketPlanes = {rocketPlane, rocketPlane1, rocketPlane2};

        Plane[] planes = {airplane, airplane1, airplane2, rocketPlane, rocketPlane1, rocketPlane2};

        App app = new App();
        app.runFly(airplanes);
        app.runFly(rocketPlanes);

        Flyable bird = new Bird();
        Flyable bird1 = new Bird();
        Flyable[] birds = {bird, bird1};

        Flyable[] flyables = {airplane, airplane1, airplane2, bird, bird1};

        app.toFly(flyables);
        app.toFly(birds);
        app.toFly(airplanes);
    }

    private void toFly(Flyable[] flyable) {
        for (Flyable element : flyable) {
            element.fly();
        }
    }

    private void runFly(Plane[] planes) {
        for (Plane plane : planes) {
            plane.toFly();

            if (plane instanceof Airplane) {
                Airplane plane1 = (Airplane) plane;
                plane1.printNotFly();
                plane1.nameAirplane = "A";
            }
            if (plane instanceof RocketPlane) {
                RocketPlane plane2 = (RocketPlane) plane;
                plane2.printFly();
                plane2.nameRocketPlane = "R";
            }

        }
    }
}

//            ((Airplane) plane).printNotFly();
//            ((RocketPlane)plane).printFly();
