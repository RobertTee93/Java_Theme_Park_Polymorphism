package ThemeParkTest;

import Attractions.Carousel;
import Attractions.Rollercoaster;
import Stalls.BeerStall;
import Stalls.BurgerStall;
import ThemePark.ThemePark;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    public ThemePark themePark;
    public Carousel carousel;
    public Rollercoaster rollercoaster;
    public BeerStall beerStall;
    public BurgerStall burgerStall;

    @Before
    public void setUp(){
        themePark = new ThemePark("Test Land");
        carousel = new Carousel("Carousel", 15, 4);
        rollercoaster = new Rollercoaster("Big Dipper", 20, 10, 4.5);
        beerStall = new BeerStall("Moe's", "Moe Syzlak", "2B", 18);
        burgerStall = new BurgerStall("Mcdonald's", "Ronald Mcdonald", "2A");
    }

    @Test
    public void hasName(){
        assertEquals("Test Land", themePark.getName());
    }

    @Test
    public void shouldStarWithNoAttractions(){
        assertEquals(0, themePark.countAttractions());
    }

    @Test
    public void shouldStartWithNoStalls(){
        assertEquals(0, themePark.countStalls());
    }

    @Test
    public void canAddAttractions(){
        themePark.addAttraction(rollercoaster);
        themePark.addAttraction(carousel);
        assertEquals(2, themePark.countAttractions());
    }

    @Test
    public void canAddStalls(){
        themePark.addStall(beerStall);
        themePark.addStall(burgerStall);
        assertEquals(2, themePark.countStalls());
    }

    @Test
    public void canGetAllStallsAndAttractions(){
        themePark.addStall(beerStall);
        themePark.addStall(burgerStall);
        themePark.addAttraction(rollercoaster);
        themePark.addAttraction(carousel);
        assertEquals(4, themePark.getAllReviewed().size());
    }
}
