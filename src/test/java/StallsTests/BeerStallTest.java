package StallsTests;

import People.Visitor;
import Stalls.BeerStall;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BeerStallTest {

    public BeerStall beerStall;


    @Before
    public void setUp(){
        beerStall = new BeerStall("Moe's", "Moe Syzlak", "2B", 18);
    }

    @Test
    public void hasName(){
        assertEquals("Moe's", beerStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Moe Syzlak", beerStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("2B", beerStall.getParkingSpot());
    }

    @Test
    public void hasMinAge(){
        assertEquals(18, beerStall.getMinAge());
    }

    @Test
    public void checkIfOldEnough__IsOldEnough(){
        Visitor oldVisitor = new Visitor("Jimmy", 50, 5.7, 1000);
        assertEquals(true, beerStall.isAllowed(oldVisitor));
    }

    @Test
    public void checkIfOldEnough__IsNotOldEnough(){
        Visitor youngVisitor = new Visitor("Jimmy", 17, 5.7, 100);
        assertEquals(false, beerStall.isAllowed(youngVisitor));
    }
}
