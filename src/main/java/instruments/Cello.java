package instruments;

import enums.CelloType;
import enums.MaterialType;
import enums.StringType;

public class Cello extends StringInstrument {

    private CelloType celloType;
    private StringType stringType;

    public Cello(String name, MaterialType materialType, int buyingPrice, int sellingPrice, boolean bow, CelloType celloType, StringType stringType) {
        super(name, materialType, buyingPrice, sellingPrice, bow);
        this.celloType = celloType;
        this.stringType = stringType;
    }

    public int getNumberOfStrings(){
        return 4;
    }

    public CelloType getCelloType() {
        return celloType;
    }

    public StringType getStringType() {
        return stringType;
    }
}
