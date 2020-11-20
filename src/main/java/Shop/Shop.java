package Shop;

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
}
