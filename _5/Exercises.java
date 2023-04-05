package javaadvanced._5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) throws Exception {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     * prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");

        // surroundata automaticamente
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (IOException e) {
            System.err.println("Errore.");
            throw new RuntimeException(e);
        }

    }

    /**
     * 2:
     * <p>
     * Write a try-catch block that attempts to open a file
     * <p>
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");

        try {
            String userInputFileName = "test-file.txt";
            File file = new File(userInputFileName);
            Scanner scanner = new Scanner(file);
            System.out.println(scanner);
            // tipologia di eccezione consigliata dall'IDE;
        } catch (FileNotFoundException exception) {
            System.err.println("ERROR 404: file not found🙁");
            exception.printStackTrace();
            System.exit(0);
        }

    }

    /**
     * 3:
     * <p>
     * Write a try-catch block that attempts to parse a string as an integer.
     * <p>
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {
            Integer.parseInt("house");
            // tipologia di eccezione consigliata dall'IDE;
        } catch (NumberFormatException ex) {
            System.err.println("Ma che stai facendo?");
            ex.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 4:
     * <p>
     * Write a try block that around this print statement that attempts to divide 2 numbers
     * <p>
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     * <p>
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        Double num1 = 10.0;
        String num2AsString = "0.0";
        try {
            System.out.println(num1 / Double.parseDouble(num2AsString));
            // tipologia di eccezione consigliata dall'IDE;
        } catch (NumberFormatException exception) {
            System.err.println("Errore");
            exception.printStackTrace();
            System.exit(0);
        }


    }
}
