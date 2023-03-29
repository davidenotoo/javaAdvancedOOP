package javaadvanced._3;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     * then recreates a new list of unique items
     * <p>
     * You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // inserisco la lista in un set così i doppioni vengono automaticamente rimossi;
        Set<String> sdoppionaotre = new HashSet<>(list);
        // infine riassegno a list il set;
        list = new ArrayList<>(sdoppionaotre);

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     * the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");

        // richiesta dell'esercizio;
        Set<String> listaConvertita = toSet(list);
        Set<String> setConvertito = toSet(set);

        // prova per vedere se funziona;
        List<String> listaProva = Arrays.asList("0", "1", "2", "3");
        Set<String> merge2Collezioni = twoListToSet(list, listaProva);

        // test
        System.out.println(listaConvertita);
        System.out.println(setConvertito);
        System.out.println(merge2Collezioni);

    }

    // ho creato un metodo che accetta una collezione e restituisce un SET per rimuovere i doppioni;
    private static Set<String> toSet(Collection<String> collezione) {
        return new HashSet<>(collezione);
    }

    // PROVA: secondo metodo di prova che accetta 2 parametri di tipo collezione;
    private static Set<String> twoListToSet(Collection<String> collezione, Collection<String> collezione1) {
        Set<String> liste = new HashSet<>(collezione);
        liste.addAll(collezione1);
        return liste;
    }

    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();

//         Write code to count the number of occurrences of each word in the String `words`
//         and store the counts in the Map `wordCount`, note you will need to first get the previous value
//         from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.


        // collezione con i counter;
        System.out.println("Contatore ripetizione parole: \n" + contaParole(words));


        // collezione senza doppioni tanto per;
        Set<String> wordsNoDopp = new HashSet<>(words);
        System.out.println("Collezione senza doppioni: \n" + wordsNoDopp);
    }

    private static Map<String, Integer> contaParole(List<String> collezione) {

        // creo una mappa in cui inserire le Key(parole) e Value(quante volte si ripete la stessa parola);
        Map<String, Integer> wordCount = new HashMap<>();

        // itero all'interno della collezione
        for (int i = 0; i < collezione.size(); i++) {
            // pesco la parola corrente del ciclo;
            String parola = collezione.get(i);
            // assegno a "ripetizione" il valore di indice della parola stessa (es. se gli indici sono 2 allora diventa 2);
            int ripetizione = wordCount.getOrDefault(parola, 0);
            // inserisco nella mappa la parola e il numero di ripetizione +1 perchè in default è 0;
            wordCount.put(parola, ripetizione + 1);
        }
        return wordCount;
    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer:
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer:
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer:
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer:
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer:
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer:
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer:
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer:
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer:
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer:
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer:
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer:
     */

}
