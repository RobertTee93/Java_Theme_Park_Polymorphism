package Attractions;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import People.Visitor;

public class Rollercoaster extends Attraction implements ITicketed, ISecurity {

    private double minHeight;
    private double price;

    public Rollercoaster(String name, int capacity, int price, double minHeight) {
        super(name, capacity);
        this.minHeight = minHeight;
        this.price = price;
    }

    public double getMinHeight() {
        return minHeight;
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

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 5.2){
            return true;
        } else {
            return false;
        }
    }
}
