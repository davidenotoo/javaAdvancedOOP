package javaadvanced.parte3._1;

import java.math.BigDecimal;
import java.math.BigInteger;

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
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     * <p>
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     * <p>
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        double x = Math.random() * 100;
        String maggiore = (x > 50) ? x + " è maggiore di 50" : x + " è minore di 50";
        System.out.println(maggiore);
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create a record called "Person" with fields for name, age and address.
     * <p>
     * Add a toString method to Person to print out the data in a different format
     * <p>
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Person person = new Person("Davide", 26, "Via col vento");
        System.out.println(person);
    }

    /**
     * 3:
     * <p>
     * <p>
     * In the main method, create a BigInteger variable with a large value.
     * <p>
     * Create a BigDecimal variable with a large value
     * <p>
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     * <p>
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     * <p>
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        BigInteger graaaande = new BigInteger("780912758461571087601239885409843759084370987901253");
        BigDecimal grandeVirgola = new BigDecimal("24357852789020543578290253784237849.078523785904");
        BigInteger risultatoDivisione = graaaande.divide(new BigInteger("3"));

        System.out.println(risultatoDivisione);

        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal risultato = grandeVirgola.divide(pi);

        System.out.println(risultato+ "");

    }

}
