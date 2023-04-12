package javaadvanced.parte2._2.ClassiEsercizio2;

public class Car implements Movable {
    @Override
    public void moveForward() {
        System.out.println("Sono un'automobile e mi posso muovere in avanti");
    }

    @Override
    public void moveBackward() {
        System.out.println("Sono un'automobile e mi posso muovere indietro");
    }
}
