package Instruments.Percussion;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Drum extends Instrument {

    public Drum(InstrumentType type, String material, String colour, double purchasedPrice, double sellPrice, int quantity) {
        super(type, material, colour, purchasedPrice, sellPrice,quantity);
    }

    public String play() {
        return "Boom Boom I am playing the Drum";
    }

}
