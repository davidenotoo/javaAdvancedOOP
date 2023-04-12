package javaadvanced.parte2._2.ClassiEsercizio1;

public abstract class Shape {
    protected Double height;
    protected Double width;

    public Shape(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public abstract double calcArea();

}
