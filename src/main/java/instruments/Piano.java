package instruments;

import behaviours.ISell;
import enums.MaterialType;
import enums.PianoType;

public class Piano extends Instrument{

    private PianoType pianoType;
    private int numberOfKeys;

    public Piano(String name, MaterialType materialType, int buyingPrice, int sellingPrice, PianoType pianoType, int numberOfKeys) {
        super(name, materialType, buyingPrice, sellingPrice);
        this.pianoType = pianoType;
        this.numberOfKeys = numberOfKeys;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "Lalalalalala";
    }
}
