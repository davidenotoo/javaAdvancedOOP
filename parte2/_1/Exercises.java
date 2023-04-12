package javaadvanced.parte2._1;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Dog cane = new Dog(60.0, 35.0, "");
        // breed settato dopo, solo per la consegna;
        cane.setBreed("Labrador");
        System.out.println(cane.getBreed());
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // test Fish
        Fish pesce = new Fish(0.40, 1.2, "");
        pesce.setSpecies("Spigola");
        System.out.println(pesce.getSpecies());
        //test bird
        Bird uccello = new Bird(0.10, 0.5, 0.0);
        uccello.setWingSpan(0.30);
        System.out.println(uccello.getHeight());
    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Dog cane = new Dog(60.0, 35.0, "Labrador");
        Fish pesce = new Fish(0.40, 1.2, "Spigola");
        Bird uccello = new Bird(0.10, 0.5, 0.30);

        // triplo Math.max()
        Double maxSpeed = Math.max(cane.runSpeedMetersPerSecond(), Math.max(pesce.swimSpeedMetersPerSecond(), uccello.flySpeedMetersPerSecond()));

        // stampa dell'animale vincitore, funziona solo con equals;
        if (maxSpeed.equals(cane.runSpeedMetersPerSecond())) {
            System.out.println("Cane");
        } else if (maxSpeed.equals(pesce.swimSpeedMetersPerSecond())) {
            System.out.println("Pesce");
        } else if (maxSpeed.equals(uccello.flySpeedMetersPerSecond())) {
            System.out.println("Uccello");
        }

    }
}
