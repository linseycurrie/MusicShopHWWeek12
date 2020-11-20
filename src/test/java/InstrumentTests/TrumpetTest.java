package InstrumentTests;

import Instruments.Brass.Trumpet;
import Instruments.InstrumentType;
import Instruments.Percussion.Piano;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
            trumpet = new Trumpet(InstrumentType.BRASS, "Brass", "Gold", 2000, 3000, 5);
    }

    @Test
    public void canPlay(){
        Assert.assertEquals("Toot Toot, I am playing the Trumpet", trumpet.play());
    }

    @Test
    public void testTypeIsEnum(){
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(1000, trumpet.calcMarkUp(), 0.001);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(5000, trumpet.getProfit(), 0.01);
    }

    @Test
    public void canCheckStockAndSell(){
        assertEquals("Item sold", trumpet.checkStockAndSell());
    }

    @Test
    public void stockReducedWhenSold(){
        trumpet.checkStockAndSell();
        assertEquals(4, trumpet.getQuantity());
    }
}
