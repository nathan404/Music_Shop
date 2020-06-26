package instruments;

import enums.MaterialType;
import enums.StringType;
import enums.ViolinType;

public class Violin extends StringInstrument{

    private ViolinType violinType;
    private StringType stringType;

    public Violin(String name, MaterialType materialType, int buyingPrice, int sellingPrice, ViolinType violinType, StringType stringType) {
        super(name, materialType, buyingPrice, sellingPrice);
        this.violinType = violinType;
        this.stringType = stringType;
    }

    public int getNumberOfStrings(){
        return 4;
    }

    public boolean hasBow(){
        return true;
    }

    public ViolinType getViolinType() {
        return violinType;
    }

    public StringType getStringType() {
        return stringType;
    }

    public String play(){
        return "Deedeedee";
    }
}
