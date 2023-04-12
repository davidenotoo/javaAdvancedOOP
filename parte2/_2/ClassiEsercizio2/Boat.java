package javaadvanced.parte2._2.ClassiEsercizio2;

public class Boat implements Movable {
    @Override
    public void moveForward() {
        System.out.println("Sono una barca e mi posso muovere in avanti");
    }

    @Override
    public void moveBackward() {
        System.out.println("Sono una barca e mi posso muovere indietro");
    }
}
