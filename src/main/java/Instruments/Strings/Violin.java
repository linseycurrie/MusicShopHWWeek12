package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Violin extends Instrument {

    private String sizeOfViolin;

    public Violin(InstrumentType type, String material, String colour, double purchasedPrice, double sellPrice, int quantity){
        super(type, material, colour, purchasedPrice, sellPrice,quantity);
    }


    public String play() {
        return "Screech Screech I am playing the Violin";
    }

    public String getSizeOfViolin() {
        return sizeOfViolin;
    }

    public void setSizeOfViolin(String sizeOfViolin) {
        this.sizeOfViolin = sizeOfViolin;
    }
}
