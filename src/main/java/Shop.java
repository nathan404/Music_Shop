import accessories.Accessory;
import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private String name;
    private int till;
    private ArrayList<ISell> stock;


    public Shop(String name, int till, ArrayList<ISell> stock) {
        this.name = name;
        this.till = till;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockCount() {
        return getStock().size();
    }

    public void addToTill(int amount) {
        till += amount;
    }

    public void removeFromTill(int amount) {
        till -= amount;
    }

    public void addInstrumentToStock(Instrument instrument) {
        stock.add(instrument);
        removeFromTill(instrument.getBuyingPrice());
    }

    public void addAccessoryToStock(Accessory accessory) {
        stock.add(accessory);
        removeFromTill(accessory.getBuyingPrice());
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }

    public void sellInstrument(Instrument instrument) {
        addToTill(instrument.getSellingPrice());
        removeFromStock(instrument);
    }

    public void sellAccessory(Accessory accessory) {
        addToTill(accessory.getSellingPrice());
        removeFromStock(accessory);
    }

//    public void sellItem(ISell item){
//    }

    public int calculatePotentialProfit(){
        int total = 0;
        for (ISell item : getStock()){
            total += item.calculateMarkup();
        }
        return total;
    }

}
