package accessories;

import enums.MaterialType;
import enums.PianoType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private Piano piano;
    private SheetMusic sheetMusic;

    @Before
    public void before(){
        piano = new Piano("Bechstein", MaterialType.PINE, 4000, 6000, PianoType.GRAND, 88);
        sheetMusic = new SheetMusic("Romance Larghetto", 6, 10, "Chopin", 5, piano);
    }

    @Test
    public void hasName(){
        assertEquals("Romance Larghetto", sheetMusic.getName());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(6, sheetMusic.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10, sheetMusic.getSellingPrice());
    }

    @Test
    public void hasComposer(){
        assertEquals("Chopin", sheetMusic.getComposer());
    }

    @Test
    public void hasInstrument(){
        assertEquals(piano, sheetMusic.getInstrument());
    }
}