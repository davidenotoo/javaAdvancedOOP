package javaadvanced.parte2._2.ClassiEsercizio1;

import javaadvanced.parte2._2.ClassiEsercizio1.Shape;

public class Rectangle extends Shape {

    public Rectangle(Double height, Double width) {
        super(height, width);
    }

    @Override
    public double calcArea() {
        return height * width;
    }
}
