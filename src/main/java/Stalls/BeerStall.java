package Stalls;

import Interfaces.ISecurity;
import People.Visitor;

public class BeerStall extends Stall implements ISecurity {

    private int minAge;

    public BeerStall(String name, String ownerName, String parkingSpot, int minAge) {
        super(name, ownerName, parkingSpot);
        this.minAge = minAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() < 18){
            return false;
        } else {
            return true;
        }
    }
}
