package AttractionsTests;

import Attractions.Dodgems;
import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    public Dodgems dodgems;

    @Before
    public void setUp(){
        dodgems = new Dodgems("Rodgers Dodgems", 10, 5);
    }

    @Test
    public void hasName(){
        assertEquals("Rodgers Dodgems", dodgems.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(5, dodgems.getPrice(), 2);
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, dodgems.getCapacity());
    }

    @Test
    public void shouldHalfPriceTheTicketIfGuestUnder12(){
        Visitor visitor = new Visitor("Bob", 10, 4.5, 200);
        assertEquals(2.5, dodgems.priceFor(visitor), 2);
    }
}
