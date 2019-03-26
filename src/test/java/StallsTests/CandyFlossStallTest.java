package StallsTests;

import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    public CandyFlossStall candyFlossStall;

    @Before
    public void setUp(){
        candyFlossStall = new CandyFlossStall("Sugar Clouds", "Tom Whyte", "4A");
    }

    @Test
    public void hasName() {
        assertEquals("Sugar Clouds", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Tom Whyte", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("4A", candyFlossStall.getParkingSpot());
    }
}
