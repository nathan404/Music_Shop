package instruments;

import enums.MaterialType;
import enums.StringType;
import enums.ViolinType;

public class Violin extends StringInstrument{

    private ViolinType violinType;
    private StringType stringType;

    public Violin(String name, MaterialType materialType, int buyingPrice, int sellingPrice, int numberOfStrings, boolean bow, ViolinType violinType, StringType stringType) {
        super(name, materialType, buyingPrice, sellingPrice, numberOfStrings, bow);
        this.violinType = violinType;
        this.stringType = stringType;
    }

    public ViolinType getViolinType() {
        return violinType;
    }

    public StringType getStringType() {
        return stringType;
    }
}
