package Instruments;

import Shop.ISell;

public abstract class Instrument implements ISell, IPlay {

    private InstrumentType type;
    private String material;
    private String colour;
    private double purchasedPrice;
    private double sellPrice;
    private int quantity;

    public Instrument(InstrumentType type, String material, String colour, double purchasedPrice, double sellPrice, int quantity) {
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.purchasedPrice = purchasedPrice;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
    }

    public String play() {
        return null;
    }

    public double calcMarkUp() {
        return sellPrice - purchasedPrice;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPurchasedPrice() {
        return purchasedPrice;
    }

    public void setPurchasedPrice(double purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProfit(){
        return((this.sellPrice - this.purchasedPrice) * this.quantity);
    }

    public String checkStockAndSell(){
        if(this.getQuantity() > 0){
            this.setQuantity(this.getQuantity() -1);
            return "Item sold";
        }
        return "Sorry this item is out of Stock.";
    }

}