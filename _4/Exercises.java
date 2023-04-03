package javaadvanced._4;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercises {

    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
            Files.createFile(MY_PATH);
            Files.writeString(MY_PATH, myString);
            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            FileReader reader = new FileReader("file.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }


    }

    /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split

        // metodo che utilizza i char counter;
        try {
            FileReader reader = new FileReader("file.txt");
            int data = reader.read();
            // counter di \n
            int linesCounter = 0;
            /* se il file è vuoto stampa 0 direttamente perchè mi sono accorto che se
             assegno 0 a lines counter, mi stampa 0, ovviamente, anche se c'è una riga di testo */
            if (data == -1) {
                System.out.println("File vuoto, linee totali: " + (linesCounter));
            }
            // se il file contiene almeno un carattere, quindi una linea,
            // allora incrementa il counter per ogni \n trovato
            else {
                while (data != -1) {
                    if (data == '\n') {
                        linesCounter++;
                    }
                    data = reader.read();
                }
                System.out.print(linesCounter + 1);
            }
            // gestione delle possibili eccezioni
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     * <p>
     * Then deletes the previous file with Files.delete() use inside the try block
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        try {

            // creo un file csv direttamente da qua tanto per;
            FileWriter file2 = new FileWriter("file2.csv");
            file2.write("Ciao, creo questo file per poi cancellarlo");
            file2.close();

            // cancello il povero file appena creato;
            Files.delete(Paths.get("file2.csv"));

            // verifico inutilmente la presenza del file;
            if (Files.exists(Paths.get("file2.csv"))) {
                System.out.println("il file NON è stato cancellato");
            } else {
                System.out.println("il file stato cancellato");

            }

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {
            Files.createDirectory(myDirectoryPath);
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
}
