package Shop;

import Instruments.Instrument;
import NonInstruments.NonInstrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell product) {
        this.stock.add(product);
    }

    public double CalculateOverAllProfit() {
        double totalProfit = 0;
        for (ISell item : stock) {
            totalProfit += (item.calcMarkUp() * item.getQuantity());
        }
        return totalProfit;
    }

    public double calculateTotalStockQuantity() {
        int totalStockQuantity = 0;
        for (ISell item : stock) {
            totalStockQuantity += item.getQuantity();
        }
        return totalStockQuantity;
    }

    public double sellPriceOfProduct(ISell product){
        double sellPrice = 0;
        for (ISell item: stock){
            if(item instanceof Instrument && item.equals(product)){
                sellPrice = ((Instrument) item).getSellPrice();
            } else {
                if(item instanceof NonInstrument && item.equals(product)){
                sellPrice = ((NonInstrument) item).getSellPrice();
                }
            }
        }
        return sellPrice;
    }

    public int quantityOfProductInStock(ISell product){
        int quantityInStock = 0;
        for (ISell item: stock){
            if(item instanceof Instrument && item.equals(product)){
                quantityInStock = ((Instrument) item).getQuantity();
            } else {
                if(item instanceof NonInstrument && item.equals(product)){
                    quantityInStock = ((NonInstrument) item).getQuantity();
                }
            }
        }
        return quantityInStock;
    }

    public String sellProduct(ISell product){
        String resultOfSale = null;
        for (ISell item: stock){
            if(item instanceof Instrument && item.equals(product)){
                resultOfSale = ((Instrument) item).checkStockAndSell();
            } else {
                if(item instanceof NonInstrument && item.equals(product)){
                    resultOfSale = ((NonInstrument) item).checkStockAndSell();
                }
            }
        }
        return resultOfSale;
    }
}
