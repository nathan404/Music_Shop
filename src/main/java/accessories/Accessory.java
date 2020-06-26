package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private String name;
    private int buyingPrice;
    private int sellingPrice;

    public Accessory(String name, int buyingPrice, int sellingPrice) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup(){
        return getSellingPrice() - getBuyingPrice();
    }
}
