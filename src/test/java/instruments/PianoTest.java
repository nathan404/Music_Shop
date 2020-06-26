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


}