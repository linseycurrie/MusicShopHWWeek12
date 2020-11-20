package InstrumentTests;

import Instruments.Brass.Trumpet;
import Instruments.InstrumentType;
import Instruments.Strings.Violin;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin(InstrumentType.STRINGS, "Wood", "Brown", 500, 800, 2);
    }

    @Test
    public void canPlay(){
        Assert.assertEquals("Screech Screech I am playing the Violin", violin.play());
    }

    @Test
    public void testTypeIsEnum(){
        assertEquals(InstrumentType.STRINGS, violin.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(300, violin.calcMarkUp(), 0.001);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(600, violin.getProfit(), 0.01);
    }

    @Test
    public void canCheckStockAndSell(){
        assertEquals("Item sold", violin.checkStockAndSell());
    }

    @Test
    public void stockReducedWhenSold(){
        violin.checkStockAndSell();
        assertEquals(1, violin.getQuantity());
    }
}



