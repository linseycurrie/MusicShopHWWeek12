package InstrumentTests;

import Instruments.InstrumentType;
import Instruments.Percussion.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum(InstrumentType.PERCUSSION, "Plastic", "Blue", 200, 500, 15);
    }

    @Test
    public void canPlay(){
        assertEquals("Boom Boom I am playing the Drum", drum.play());
    }

    @Test
    public void testTypeIsEnum(){
        assertEquals(InstrumentType.PERCUSSION, drum.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(300, drum.calcMarkUp(), 0.001);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(4500, drum.getProfit(), 0.01);
    }

    @Test
    public void canCheckStockAndSell(){
        assertEquals("Item sold", drum.checkStockAndSell());
    }

    @Test
    public void stockReducedWhenSold(){
        drum.checkStockAndSell();
        assertEquals(14, drum.getQuantity());
    }

}
