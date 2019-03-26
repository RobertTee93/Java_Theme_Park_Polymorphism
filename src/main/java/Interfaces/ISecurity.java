package Interfaces;

import People.Visitor;

public interface ISecurity {

    public boolean isAllowed(Visitor visitor);

}
