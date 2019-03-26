package PeopleTests;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    public Visitor visitor;

    @Before
    public void setUp(){
        visitor = new Visitor("Robert", 25, 6.2, 120);
    }

    @Test
    public void hasName(){
        assertEquals("Robert", visitor.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(25, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(6.2, visitor.getHeight(), 2);
    }

    @Test
    public void hasWallet(){
        assertEquals(120, visitor.countMoney(), 2);
    }

}
