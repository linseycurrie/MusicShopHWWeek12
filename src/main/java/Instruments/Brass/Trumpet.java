package Instruments.Brass;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(InstrumentType type, String material, String colour, double purchasedPrice, double sellPrice, int quantity) {
        super(type, material, colour, purchasedPrice, sellPrice, quantity);
        this.numberOfValves = numberOfValves;
    }

    public String play() {
        return "Toot Toot, I am playing the Trumpet";
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }
}
