package AttractionsTests;

import Attractions.KidsPlayArea;
import People.Visitor;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KidsPlayAreaTest {

    public KidsPlayArea kidsPlayArea;

    @Before
    public void setUp(){
        kidsPlayArea = new KidsPlayArea("Superhero Village", 80);
    }

    @Test
    public void hasName(){
        assertEquals("Superhero Village", kidsPlayArea.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(80, kidsPlayArea.getCapacity());
    }

    @Test
    public void checkIfOldEnough__IsTooOld(){
        Visitor oldVisitor = new Visitor("Jimmy", 50, 5.7, 1000);
        assertEquals(false, kidsPlayArea.isAllowed(oldVisitor));
    }

    @Test
    public void checkIfOldEnough__IsYoungEnough(){
        Visitor youngVisitor = new Visitor("Jimmy", 11, 5.7, 100);
        assertEquals(true, kidsPlayArea.isAllowed(youngVisitor));
    }
}
