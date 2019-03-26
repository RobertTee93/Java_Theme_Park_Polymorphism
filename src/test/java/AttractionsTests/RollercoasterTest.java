package AttractionsTests;

import Attractions.Rollercoaster;
import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    public Rollercoaster rollercoaster;

    @Before
    public void setUp(){
        rollercoaster = new Rollercoaster("Big Dipper", 20, 10, 4.5);
    }

    @Test
    public void hasName(){
        assertEquals("Big Dipper", rollercoaster.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(10, rollercoaster.getPrice(), 2);
    }

    @Test
    public void hasCapacity(){
        assertEquals(20, rollercoaster.getCapacity());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(4.5, rollercoaster.getMinHeight(), 2);
    }

    @Test
    public void shouldHalfPriceTheTicketIfGuestUnder12(){
        Visitor visitor = new Visitor("Bob", 10, 4.5, 200);
        assertEquals(5, rollercoaster.priceFor(visitor), 2);
    }

    @Test
    public void shouldOnlyAllowOnIfOldEnoughAndTallEnough__isOldEnoughAndTallEnough(){
        Visitor visitor = new Visitor("Bob", 20, 6.0, 200);
        assertEquals(true, rollercoaster.isAllowed(visitor));
    }

    @Test
    public void shouldOnlyAllowOnIfOldEnoughAndTallEnough__isOldEnoughButNotTallEnough(){
        Visitor visitor = new Visitor("Bob", 20, 4.0, 200);
        assertEquals(false, rollercoaster.isAllowed(visitor));
    }

    @Test
    public void shouldOnlyAllowOnIfOldEnoughAndTallEnough__isNotOldEnoughButTallEnough(){
        Visitor visitor = new Visitor("Bob", 7, 6.0, 200);
        assertEquals(false, rollercoaster.isAllowed(visitor));
    }

    @Test
    public void shouldOnlyAllowOnIfOldEnoughAndTallEnough__isNotOldEnoughAndNotTallEnough(){
        Visitor visitor = new Visitor("Bob", 2, 2.3, 200);
        assertEquals(false, rollercoaster.isAllowed(visitor));
    }
}
