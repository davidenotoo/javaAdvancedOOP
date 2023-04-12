package javaadvanced.parte2._3;

import java.util.Objects;

public class Person {
    private String nome;
    private Integer eta;
    private String indirizzo;

    public Person(String nome, Integer eta, String indirizzo) {
        this.nome = nome;
        this.eta = eta;
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nEtà: " + eta + "\nIndirizzo: " + indirizzo;
    }

    // generato in automatico;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nome, person.nome) && Objects.equals(eta, person.eta) && Objects.equals(indirizzo, person.indirizzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, eta, indirizzo);
    }
}
