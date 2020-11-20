package InstrumentTests;

import Instruments.InstrumentType;
import Instruments.Strings.Violin;
import Instruments.Woodwind.Flute;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute(InstrumentType.WOODWIND, "Silver", "Silver", 500, 1000, 9, 10);
    }

    @Test
    public void canPlay() {
        Assert.assertEquals("Toot toot I am playing the Flute", flute.play());
    }

    @Test
    public void testTypeIsEnum(){
        assertEquals(InstrumentType.WOODWIND, flute.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(500, flute.calcMarkUp(), 0.001);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(5000, flute.getProfit(), 0.01);
    }

    @Test
    public void canCheckStockAndSell(){
        assertEquals("Item sold", flute.checkStockAndSell());
    }

    @Test
    public void stockReducedWhenSold(){
        flute.checkStockAndSell();
        assertEquals(9, flute.getQuantity());
    }

}
