package instruments;

import enums.MaterialType;

public abstract class StringInstrument extends Instrument{

    private int numberOfStrings;
    private boolean bow;

    public StringInstrument(String name, MaterialType materialType, int buyingPrice, int sellingPrice, int numberOfStrings, boolean bow) {
        super(name, materialType, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
        this.bow = bow;
    }

    public abstract int getNumberOfStrings();

    public boolean hasBow() {
        return bow;
    }
}
