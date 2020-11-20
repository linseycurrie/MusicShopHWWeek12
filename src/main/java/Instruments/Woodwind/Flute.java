package Instruments.Woodwind;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Flute extends Instrument {

    private int numOfKeys;

    public Flute(InstrumentType type, String material, String colour, double purchasedPrice, double sellPrice, int numOfKeys, int quantity) {
        super(type, material, colour, purchasedPrice, sellPrice, quantity);
        this.numOfKeys = numOfKeys;
    }

    public String play() {
        return "Toot toot I am playing the Flute";
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public void setNumOfKeys(int number) {
        this.numOfKeys = number;
    }
}

