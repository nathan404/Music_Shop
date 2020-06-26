package accessories;

import instruments.StringInstrument;

public class Bow extends Accessory {

    private StringInstrument stringInstrument;

    public Bow(String name, int buyingPrice, int sellingPrice, StringInstrument stringInstrument) {
        super(name, buyingPrice, sellingPrice);
        this.stringInstrument = stringInstrument;
    }

    public StringInstrument getStringInstrument() {
        return stringInstrument;
    }
}
