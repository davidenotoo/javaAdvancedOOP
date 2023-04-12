package javaadvanced.parte2._2.ClassiEsercizio3;

public class Piano extends Instrument implements Playable {


    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("Il piano è uno strumento");
        super.play();
    }
}
