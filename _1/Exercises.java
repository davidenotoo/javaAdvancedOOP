package javaadvanced._1;

import java.util.*;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1:
     * <p>
     * 1. Add some numbers (1, 1, 5, 2, 1) to the set using the add() method.
     * 2. Remove '1' from  the set using the .remove(1)
     * 3. Print the set again to confirm the element was removed.
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        Set<Integer> ourSet = new HashSet<>();

        // aggiungo 5 numeri di cui 3 uguali che vengono automaticamente rimossi in quanto doppioni;
        ourSet.add(1);
        ourSet.add(1);
        ourSet.add(5);
        ourSet.add(2);
        ourSet.add(1);

        // if statement errato (commentato) fornito dall'esercizio in quanto il
        // metodo .containsAll() può restituire true solamente se tutti
        // i valori presenti al suo interno esistono in collezione
        // e inoltre non riesce a entrare nell'else🫡;
/*
           if (ourSet.containsAll(Set.of(1, 1, 5, 2, 1))) {
            System.out.println("1a. Set contains all numbers");
        }
*/

        // if st. modificato;
        if (ourSet.containsAll(Set.of(1, 5, 2))) {
            System.out.println("1a. Set contains all numbers");
        } else {
            System.out.println("1a. Set does not contain all numbers");
        }

        System.out.println(ourSet);

        // Remove the element '1'
        // Your code
        ourSet.remove(1);

        System.out.println(ourSet);

        if (ourSet.contains(1)) {
            System.out.println("1b. The set still contains 1");
        } else {
            System.out.println("1b. The set does not contain 1");
        }
    }

    /**
     * 2:
     * <p>
     * Read the comments below and write comments on what you think our print statement will output!
     */
    private static void exercise2() {
        Set<String> fruitsSet = new HashSet<>();

        fruitsSet.add("apple");
        fruitsSet.add("banana");
        fruitsSet.add("orange");
        fruitsSet.add("kiwi");
        fruitsSet.add("mango");


        fruitsSet.addAll(fruitsSet);

        //2a. What will this output?
        // [a riga79 vengono aggiunti per la seconda volta gli stessi elementi precedentemente aggiunti da
        // riga 72 a 76, quindi essendo una collezione di tipo SET vengono automaticamente rimossi i doppioni]
        System.out.println(fruitsSet);

        List<String> fruitsList = List.of("apple", "banana", "grapes", "pear", "mango");

        fruitsSet.addAll(fruitsList);

        //2b. What will this output?
        // [In questo caso a riga 88 aggiungiamo una lista al SET e automaticamente fa un merge dei valori, rimuovendo i doppioni presenti];
        System.out.println(fruitsSet);
    }

    /**
     * 3: Write code to solve the following problems
     */
    private static void exercise3() {
        // 3a. Find the min and max values in the Set below
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        // ho creato 3 scope con 3 metodi diversi...

        {  // 1° scope: metodo sviluppato il un momento di confusione ma 9 volte su 10 funziona!
            List<Integer> indexatore = new ArrayList<>();
            indexatore.addAll(numbers);
            Integer p = indexatore.get(0);
            for (int i = 0; i < indexatore.size(); i++) {
                if (indexatore.get(i) > indexatore.get(0)) {
                    p = indexatore.get(i);
                }
            }
            max = p;

            List<Integer> indexatore1 = new ArrayList<>();
            indexatore1.addAll(numbers);
            Integer p1 = indexatore1.get(0);
            for (int j = 0; j < indexatore1.size(); j++) {
                if (indexatore1.get(j) < indexatore1.get(0)) {
                    p1 = indexatore1.get(j);
                }
            }
            min = p1;

            System.out.println("Primo max: " + max + " Primo min: " + min);
        }

        {   // 2° scope creato modificando ì valori di min e max invertendoli;
            // in questo caso avrei pure potuto utilizzare i metodi Mat.max e min all'interno del forEach;
            int max1 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE;

            Set<Integer> numbers1 = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            for (int number1 : numbers1) {
                if (number1 > max1) {
                    max1 = number1;
                }
                if (number1 < min1) {
                    min1 = number1;
                }
            }

            System.out.println("Secondo max: " + max1 + " Secondo min: " + min1);

        }

        {   // 3° scope creando un TreeSet che automaticamente ordina il valore minimo all'inizio e il valore massimo alla fine.
            Set<Integer> alberello = new TreeSet<>();
            alberello.addAll(numbers);
            int min2 = ((TreeSet<Integer>) alberello).first();
            int max2 = ((TreeSet<Integer>) alberello).last();

            System.out.println("Terzo max: " + max2 + " Terzo min: " + min2);

        }

        if (max != 10 || min != 1) {
            System.out.println("3a. Incorrect min or max values");
        }

        // 3b. Find which items from set a are also in set b, add these to itemsContainedInBothSets
        //     use the `contains` method and "nested" for loop
        Set<Integer> setA = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> setB = Set.of(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Set<Integer> itemsContainedInBothSets = new HashSet<>();

        // non c'è bisogno di fare un for nidificato;
        for (Integer nino : setA) {
            if (setB.contains(nino)) {
                itemsContainedInBothSets.add(nino);
            }
        }

        if (!itemsContainedInBothSets.equals(Set.of(5, 6, 7, 8, 9, 10))) {
            System.out.println("3b. Incorrect number of items in itemsContainedInBothSets");
        } else {
            System.out.println("3b. Correct number of items in itemsContainedInBothSets");
        }
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     */
    private static void exercise4() {
        Set<Integer> orderedNumbers = new TreeSet<>();
        orderedNumbers.addAll(Set.of(5, 3, 1, 2, 4, 6, 7, 8, 9, 10));
        // 4a. Find the min value in the TreeSet with as few loops as possible,
        //     you can use `break;` to exit the loop once you've found it!
        int min1 = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        // metodo istantaneo:
        min1 = ((TreeSet<Integer>) orderedNumbers).first();

        // metodo con forEach:
        for (Integer gino : orderedNumbers) {
            if (min > gino) {
                min = gino;
            }
        }

        if (min != 1) {
            System.out.println("4a. Incorrect min value");
        } else {
            System.out.println("4a. Correct min value");
        }
    }
}
