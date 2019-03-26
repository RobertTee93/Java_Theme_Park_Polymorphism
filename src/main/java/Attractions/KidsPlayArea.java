package Attractions;

import Interfaces.ISecurity;
import People.Visitor;

public class KidsPlayArea extends Attraction implements ISecurity {

    public KidsPlayArea(String name, int capacity) {
        super(name, capacity);
    }

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() > 12){
            return false;
        } else {
            return true;
        }
    }
}
