package instruments;

import enums.GuitarStringType;
import enums.GuitarType;
import enums.MaterialType;

public class Guitar extends StringInstrument {

    private GuitarType guitarType;
    private GuitarStringType guitarStringType;

    public Guitar(String name, MaterialType materialType, int buyingPrice, int sellingPrice, GuitarType guitarType, GuitarStringType guitarStringType) {
        super(name, materialType, buyingPrice, sellingPrice);
        this.guitarType = guitarType;
        this.guitarStringType = guitarStringType;
    }

    public int getNumberOfStrings(){
        return 6;
    }

    public boolean hasBow(){
        return false;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public GuitarStringType getGuitarStringType() {
        return guitarStringType;
    }

    public String play(){
        return "Dangdangdang";
    }

    public int getNumberOfFrets(){
        return this.guitarType.getFretNumber();
    }

}
