package javaadvanced._6;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");

        // metodo 1
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day);
        }
        // metodo 2 utilizzado il collapse automatico dell'IDE
        Arrays.stream(DaysOfWeek.values()).forEach(System.out::println);
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */

    private enum Season {
        // inizializzo le final enum
        SPRING("22 Marzo -> 21 Giugno"),
        SUMMER("22 Giugno -> 21 Settembre"),
        FALL("22 Settembre -> 21 Dicembre"),
        WINTER("22 Dicembre -> 21 Marzo");

        // creo una stringa vuota
        private String range;

        // inizializzo una specie di costruttore che assegna le stringhe degli enum alla variabile
        Season(String range) {
            this.range = range;
        }

        // creo un metodo per stambare la stringa;
        public void toPrint() {
            System.out.println(this.range);
        }
    }

    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // ciclo per stampare tutte e le stringe degli enum
        for (Season s : Season.values()) {
            s.toPrint();
        }
    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private enum TrafficLight {
        RED, YELLOW, GREEN
    }

    // metodo che accetta la luce corrente e restituisce la successiva
    private static TrafficLight nextLight(TrafficLight trafficLight) {
        switch (trafficLight) {
            case RED:
                return TrafficLight.GREEN;
            case YELLOW:
                return TrafficLight.RED;
            case GREEN:
                return TrafficLight.YELLOW;
        }
        return trafficLight;
    }

    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // print test
        System.out.println("Dopo la luce VERDE si accenderà quella: " + nextLight(TrafficLight.GREEN));
        System.out.println("Dopo la luce GIALLA si accenderà quella: " + nextLight(TrafficLight.YELLOW));
        System.out.println("Dopo la luce ROSSA si accenderà quella: " + nextLight(TrafficLight.RED));
    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // visto che nella consegna c'è scritto di aggiungere un campo locale ho fatto così,
        // non so se ho capito male io, ma avrei inserito is weekend direttamente nell'enum sopra;
        boolean isWeekend;
        for (DaysOfWeek days : DaysOfWeek.values()) {
            if (days.equals(DaysOfWeek.SATURDAY) || days.equals(DaysOfWeek.SUNDAY)) {
                isWeekend = true;
            } else {
                isWeekend = false;
            }
            if (isWeekend) {
                System.out.println(days + " Festivo✝️");
            } else {
                System.out.println(days + " Feriale🛠️");
            }
        }
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */

    private enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    /**
     * Metodo che accetta due interi e un tipo di operazione enum (ADD, SUBTRACT, MULTIPLY, DIVIDE)
     * restituisce il risultato in base all'operazione passata;
     *
     * @param primoNumero
     * @param secondoNumero
     * @param operator      (ADD, SUBTRACT, MULTIPLY, DIVIDE)
     * @return risultato
     * @info tutte le operazioni vengono fatte in ordine (esempio: il primo int diviso il secondo int)
     */
    private static Double operaMath(Double primoNumero, Double secondoNumero, Operator operator) {
        // la consegna chiede un Integer ma ho preferite utilizzare i Double
        Double risultato = 0.0;
        switch (operator) {
            case ADD -> risultato = primoNumero + secondoNumero;
            case SUBTRACT -> risultato = primoNumero - secondoNumero;
            case MULTIPLY -> risultato = primoNumero / secondoNumero;
            case DIVIDE -> risultato = primoNumero * secondoNumero;
        }
        return risultato;
    }

    private static void exercise5() {
        System.out.println("\nExercise 5: ");

        double num1 = 5;
        double num2 = 2;

        // test collassato dall'ide, wow, mi piace!
        for (Operator operator : Arrays.asList(Operator.ADD, Operator.SUBTRACT, Operator.MULTIPLY, Operator.DIVIDE)) {
            System.out.println(operaMath(num1, num2, operator));
        }
    }
}
