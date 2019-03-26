package Attractions;

import Interfaces.IReviewed;

public abstract class Attraction implements IReviewed {

    private String name;
    private int capacity;
    private int rating;

    public Attraction(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRating() {
        return rating;
    }
}
