package InstrumentTests;

import Instruments.Brass.Trumpet;
import Instruments.InstrumentType;
import Instruments.Strings.Guitar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.STRINGS, "Wood", "Black and White", 500, 1500, 5, 20);
    }

    @Test
    public void canPlay(){
        Assert.assertEquals("Strum Strum I am playing the Guitar", guitar.play());
    }

    @Test
    public void testTypeIsEnum(){
        assertEquals(InstrumentType.STRINGS, guitar.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(1000, guitar.calcMarkUp(), 0.001);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(20000, guitar.getProfit(), 0.01);
    }

    @Test
    public void canCheckStockAndSell(){
        assertEquals("Item sold", guitar.checkStockAndSell());
    }

    @Test
    public void stockReducedWhenSold(){
        guitar.checkStockAndSell();
        assertEquals(19, guitar.getQuantity());
    }
}
