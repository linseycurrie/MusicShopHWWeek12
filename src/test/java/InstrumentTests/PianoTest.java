package InstrumentTests;

import Instruments.InstrumentType;
import Instruments.Percussion.Piano;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.PERCUSSION, "Wood and Metal", "Black", 5500, 8300, "Horizontal", 10);
    }

    @Test
    public void canPlay(){
        Assert.assertEquals("Plink Plonk I am playing the Piano", piano.play());
    }

    @Test
    public void testTypeIsEnum(){
        assertEquals(InstrumentType.PERCUSSION, piano.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(2800, piano.calcMarkUp(), 0.01);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(28000, piano.getProfit(), 0.01);
    }

    @Test
    public void canCheckStockAndSell(){
        assertEquals("Item sold", piano.checkStockAndSell());
    }

    @Test
    public void stockReducedWhenSold(){
        piano.checkStockAndSell();
        assertEquals(9, piano.getQuantity());
    }
}
