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

    public int getStockCount(){
        return getStock().size();
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }

    public void addToTill(int amount){
        till += amount;
    }

    public void removeFromTill(int amount){
        till -= amount;
    }
}
