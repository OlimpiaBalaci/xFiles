package model;

public class Animal extends Obstacle {

    public Animal(String type, int size) {
        super(type, size);
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{}";
    }
}
