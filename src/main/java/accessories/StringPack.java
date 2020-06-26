package accessories;

import instruments.StringInstrument;

public class StringPack extends Accessory {

    private StringInstrument stringInstrument;


    public StringPack(String name, int buyingPrice, int sellingPrice, StringInstrument stringInstrument) {
        super(name, buyingPrice, sellingPrice);
        this.stringInstrument = stringInstrument;
    }

    public StringInstrument getStringInstrument() {
        return stringInstrument;
    }
}
