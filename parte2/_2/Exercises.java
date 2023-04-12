package javaadvanced.parte2._2;

import javaadvanced.parte2._2.ClassiEsercizio1.Circle;
import javaadvanced.parte2._2.ClassiEsercizio1.Rectangle;
import javaadvanced.parte2._2.ClassiEsercizio2.Boat;
import javaadvanced.parte2._2.ClassiEsercizio2.Car;
import javaadvanced.parte2._2.ClassiEsercizio3.Guitar;
import javaadvanced.parte2._2.ClassiEsercizio3.Piano;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * Create an abstract class called "Shape" with fields of height and width
     * <p>
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape class and implement the calculateArea() method.
     * <p>
     * Create instances of both and calculate their area
     * <p>
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     * <p>
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println("Area del rettangolo: " + rectangle.calcArea());

        Circle circle = new Circle(4.0, 4.0);
        System.out.println("Area del cerchio: " + circle.calcArea());
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     * <p>
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     * <p>
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");

        // Car test
        Car automobile = new Car();
        automobile.moveForward();
        automobile.moveBackward();

        // Boat test
        Boat barca = new Boat();
        barca.moveForward();
        barca.moveBackward();

    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an interface called "Playable" with an abstract method called "play()".
     * <p>
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     * <p>
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     * <p>
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");

        Guitar chitarra = new Guitar("Chitarra", "Gibson");
        chitarra.play();

        Piano piano = new Piano("Pianoforte", "Yamaha");
        piano.play();
    }
}
