package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(InstrumentType type, String material, String colour, double purchasedPrice, double sellPrice, int numberOfStrings, int quantity) {
        super(type, material, colour, purchasedPrice, sellPrice, quantity);
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "Strum Strum I am playing the Guitar";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
