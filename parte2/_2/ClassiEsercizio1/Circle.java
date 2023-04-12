package javaadvanced.parte2._2.ClassiEsercizio1;

import javaadvanced.parte2._2.ClassiEsercizio1.Shape;

public class Circle extends Shape {

    // avrei messo semplicemente un private Double radius;
    public Circle(Double height, Double width) {
        super(height, width);
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow((height / 2), 2);
    }
}
