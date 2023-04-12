package javaadvanced.parte2._1;

public class Fish extends Animal{
    private String species;

    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public Double swimSpeedMetersPerSecond() {
        return getWeight() * 2;
    }
}
