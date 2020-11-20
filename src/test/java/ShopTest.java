import Instruments.Brass.Trumpet;
import Instruments.InstrumentType;
import Instruments.Percussion.Drum;
import Instruments.Percussion.Piano;
import Instruments.Strings.Guitar;
import Instruments.Woodwind.Flute;
import NonInstruments.MusicStand;
import NonInstruments.Plectrum;
import Shop.ISell;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    Trumpet trumpet;
    MusicStand musicStand;
    Guitar guitar;
    Flute flute;
    Drum drum;
    Plectrum plectrum;

    @Before
    public void before(){
        shop = new Shop();
        piano = new Piano(InstrumentType.PERCUSSION, "Wood and Metal", "Black", 5500, 8300, "Horizontal", 10);
        trumpet = new Trumpet(InstrumentType.BRASS, "Brass", "Gold", 2000, 3000, 5);
        musicStand = new MusicStand("Manhasset Model", 300, 350, 2);
        guitar = new Guitar(InstrumentType.STRINGS, "Wood", "Black and White", 500, 1500, 5, 20);
        flute = new Flute(InstrumentType.WOODWIND, "Silver", "Silver", 500, 1000, 9, 10);
        drum = new Drum(InstrumentType.PERCUSSION, "Plastic", "Blue", 200, 500, 15);
        plectrum = new Plectrum("TGI", .50, 1.50, 50);

        shop.addStock(piano);
        shop.addStock(trumpet);
        shop.addStock(musicStand);
        shop.addStock(guitar);
        shop.addStock(flute);
        shop.addStock(drum);
        shop.addStock(plectrum);

    }

    @Test
    public void canAddStock(){
        assertEquals(7, shop.getStock().size());
    }

    @Test
    public void canGetTotalStockItemValue(){
        assertEquals(112, shop.calculateTotalStockQuantity(), 0.01);
    }

    @Test
    public void canCalculateTotalProfit(){
        assertEquals(62650 , shop.CalculateOverAllProfit(), 0.01);
    }
}
