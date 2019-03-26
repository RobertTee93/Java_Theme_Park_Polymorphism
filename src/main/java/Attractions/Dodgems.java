package Attractions;

import Interfaces.ITicketed;
import People.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double price;

    public Dodgems(String name, int capacity, int price) {
        super(name, capacity);
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return this.price / 2;
        } else {
            return this.price;
        }
    }
}
