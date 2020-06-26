package accessories;

import instruments.Instrument;

public class SheetMusic extends Accessory {

    private String composer;
    private int numberOfPages;
    private Instrument instrument;

    public SheetMusic(String name, int buyingPrice, int sellingPrice, String composer, int numberOfPages, Instrument instrument) {
        super(name, buyingPrice, sellingPrice);
        this.composer = composer;
        this.numberOfPages = numberOfPages;
        this.instrument = instrument;
    }

    public String getComposer() {
        return composer;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Instrument getInstrument() {
        return instrument;
    }

}
