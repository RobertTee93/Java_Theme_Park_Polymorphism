package Attractions;

import Interfaces.ITicketed;
import People.Visitor;

public class Carousel extends Attraction implements ITicketed {

    private double price;

    public Carousel(String name, int capacity, int price) {
        super(name, capacity);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12){
            return this.price / 2;
        } else {
            return this.price;
        }

    }
}
