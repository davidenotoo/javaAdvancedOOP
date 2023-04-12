package javaadvanced.parte2._2.ClassiEsercizio3;

public class Guitar  extends Instrument implements Playable {

    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("La chitarra è uno strumento");
        super.play();
    }
}
