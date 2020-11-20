package NonInstrumentTest;

import NonInstruments.MusicStand;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMusicStand {

    MusicStand musicStand;

    @Before
    public void before(){
        musicStand = new MusicStand("Manhasset Model", 300, 350, 2);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(50, musicStand.calcMarkUp(), 0.01);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(100, musicStand.getProfit(), 0.01);
    }

    @Test
    public void canCheckStockAndSell(){
        assertEquals("Item sold", musicStand.checkStockAndSell());
    }

    @Test
    public void stockReducedWhenSold(){
        musicStand.checkStockAndSell();
        assertEquals(1, musicStand.getQuantity());
    }
}
