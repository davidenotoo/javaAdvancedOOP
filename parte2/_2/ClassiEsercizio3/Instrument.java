package javaadvanced.parte2._2.ClassiEsercizio3;

public class Instrument implements Playable {
    private String name;
    private String brand;

    public Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("Sono uno strumento quindi suono\n");
    }
}
