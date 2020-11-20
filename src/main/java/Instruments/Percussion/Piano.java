package Instruments.Percussion;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Piano extends Instrument {

    private String position;

    public Piano(InstrumentType type, String material, String colour, double purchasedPrice, double sellPrice, String position, int quantity) {
        super(type, material, colour, purchasedPrice, sellPrice,quantity);
        this.position = position;
    }

    public String play() {
        return "Plink Plonk I am playing the Piano";
    }

    public String getPositionOfPiano() {
        return position;
    }

    public void setPositionOfPiano(int sizeOfPiano) {
        this.position = position;
    }
}
