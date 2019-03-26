package AttractionsTests;

import Attractions.Carousel;
import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarouselTest {

    public Carousel carousel;

    @Before
    public void setUp(){
        carousel = new Carousel("Carousel", 15, 4);
    }

    @Test
    public void hasName() {
        assertEquals("Carousel", carousel.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(4, carousel.getPrice(), 2);
    }

    @Test
    public void hasCapacity() {
        assertEquals(15, carousel.getCapacity());
    }

    @Test
    public void shouldHalfPriceTheTicketIfGuestUnder12(){
        Visitor visitor = new Visitor("Bob", 10, 4.5, 200);
        assertEquals(2, carousel.priceFor(visitor), 2);
    }
}
