package instruments;

import enums.MaterialType;

public abstract class StringInstrument extends Instrument{

    private int numberOfStrings;
    private boolean bow;

    public StringInstrument(String name, MaterialType materialType, int buyingPrice, int sellingPrice) {
        super(name, materialType, buyingPrice, sellingPrice);
        this.numberOfStrings = 0;
//        this.bow = true;
    }

    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }

    public boolean hasBow() {
        return bow;
    }
}
