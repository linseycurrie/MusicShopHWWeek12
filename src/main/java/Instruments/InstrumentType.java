package Instruments;

public enum InstrumentType {

    WIND ("Wood"),
    BRASS ("Brass"),
    PERCUSSION ("Percussion"),
    WOODWIND ("Woodwind"),
    STRINGS ("Strings");


    protected final String type;

    InstrumentType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

}
