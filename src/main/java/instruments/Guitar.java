package instruments;

import enums.GuitarStringType;
import enums.GuitarType;
import enums.MaterialType;

public class Guitar extends StringInstrument {

    private GuitarType guitarType;
    private GuitarStringType guitarStringType;

    public Guitar(String name, MaterialType materialType, int buyingPrice, int sellingPrice, boolean bow, GuitarType guitarType, GuitarStringType guitarStringType) {
        super(name, materialType, buyingPrice, sellingPrice, bow);
        this.guitarType = guitarType;
        this.guitarStringType = guitarStringType;
    }

    public int getNumberOfStrings(){
        return 6;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public GuitarStringType getGuitarStringType() {
        return guitarStringType;
    }
}
