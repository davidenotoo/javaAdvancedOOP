package javaadvanced.parte3._2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private static List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();

    /**
     * 1:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use forEach to print the selected even numbers
     * <p>
     * %
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        evenator(ourNumbers);
    }

    private static void evenator(List<Integer> list) {
        List<Integer> pariList = list.stream().filter(pippo -> pippo % 2 != 0).collect(Collectors.toList());
        pariList.forEach(System.out::println);
    }

    /**
     * 2:
     * <p>
     * <p>
     * Use filter to select only odd numbers from the list 'ourNumbers'
     * <p>
     * Use the toSet() method to collect the selected odd numbers in a Set
     * <p>
     * Print the resulting Set
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        oddator(ourNumbers);
    }

    private static void oddator(List<Integer> list) {
        Set<Integer> evenNumbers = list.stream().filter(pippo -> pippo % 2 == 0).collect(Collectors.toSet());
        evenNumbers.forEach(System.out::println);
    }

    /**
     * 3:
     * <p>
     * <p>
     * Use map to convert the strings to uppercase
     * <p>
     * Use the toSet() method to collect the resulting uppercase strings in a Set
     * <p>
     * Print the resulting Set
     * <p>
     * BONUS: do so without creating any variables!
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        List<String> alice = List.of("Alice", "Bob", "Charlie");
        // strimmato, mappato, upperato, collettato e settato;
        System.out.println(alice.stream().map(s -> s.toUpperCase()).collect(Collectors.toSet()));
    }

    /**
     * 4:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use map to multiply the even numbers by 2
     * <p>
     * Use the toSet() method to collect the resulting numbers in a Set
     * <p>
     * Print the resulting Set
     */
    private static void exercise4() {
        System.out.println("\nExercise 4");
        operator(ourNumbers);

    }

    private static void operator(List<Integer> list) {
        Set<Integer> evenNumbers = list.stream().filter(pippo -> pippo % 2 == 0).map(pippo1 -> pippo1 * 2).collect(Collectors.toSet());
        System.out.println(evenNumbers);
    }
}
