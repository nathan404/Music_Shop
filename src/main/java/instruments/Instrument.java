package instruments;

import enums.MaterialType;

public abstract class Instrument {

    private String name;
    private MaterialType materialType;
    private int buyingPrice;
    private int sellingPrice;

    public Instrument(String name, MaterialType materialType, int buyingPrice, int sellingPrice) {
        this.name = name;
        this.materialType = materialType;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
