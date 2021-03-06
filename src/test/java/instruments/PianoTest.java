package instruments;

import enums.MaterialType;
import enums.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Bechstein", MaterialType.PINE, 4000, 6000, PianoType.GRAND, 88);
    }

    @Test
    public void hasName(){
        assertEquals("Bechstein", piano.getName());
    }

    @Test
    public void hasMaterialType(){
        assertEquals(MaterialType.PINE, piano.getMaterialType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(4000, piano.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(6000, piano.getSellingPrice());
    }

    @Test
    public void hasPianoType(){
        assertEquals(PianoType.GRAND, piano.getPianoType());
    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2000, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void canSetSellingPrice(){
        piano.setSellingPrice(8000);
        assertEquals(8000, piano.getSellingPrice());
        assertEquals(4000, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Lalalalalala", piano.play());
    }
}