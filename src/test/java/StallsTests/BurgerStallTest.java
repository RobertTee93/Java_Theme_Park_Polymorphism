package StallsTests;

import Stalls.BurgerStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BurgerStallTest {

    public BurgerStall burgerStall;

    @Before
    public void setUp(){
        burgerStall = new BurgerStall("Mcdonald's", "Ronald Mcdonald", "2A");
    }

    @Test
    public void hasName(){
        assertEquals("Mcdonald's", burgerStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Ronald Mcdonald", burgerStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("2A", burgerStall.getParkingSpot());
    }

}
