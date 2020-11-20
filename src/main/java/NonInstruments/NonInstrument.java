package NonInstruments;

import Shop.ISell;

public abstract class NonInstrument implements ISell {

    private String name;
    private double purchasedPrice;
    private double sellPrice;
    private int quantity;

    public NonInstrument(String name, double purchasedPrice, double sellPrice, int quantity) {
        this.name = name;
        this.purchasedPrice = purchasedPrice;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double calcMarkUp(){
        return (sellPrice - purchasedPrice);
    }

    public double getProfit(){
        return((sellPrice - purchasedPrice) * quantity);
    }

    public String checkStockAndSell(){
        if(getQuantity() > 0){
            setQuantity(getQuantity() -1);
            return "Item sold";
        }
        return "Sorry this item is out of Stock.";
    }
}
