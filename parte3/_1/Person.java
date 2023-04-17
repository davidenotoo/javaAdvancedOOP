package javaadvanced.parte3._1;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return "Nome: " + name + "\nEtà: " + age + "\nIndirizzo: " + address;
    }
}
