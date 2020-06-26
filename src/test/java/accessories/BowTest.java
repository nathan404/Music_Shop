package accessories;

import enums.MaterialType;
import enums.StringType;
import enums.ViolinType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowTest {

    private Violin violin;
    private Bow bow;

    @Before
    public void before(){
        violin = new Violin("Stradivarius", MaterialType.SPRUCE, 1000000, 2000000, ViolinType.CLASSICAL, StringType.GUT);
        bow = new Bow("Beginner's Bow", 300, 500, violin);
    }

    @Test
    public void hasName(){
        assertEquals("Beginner's Bow", bow.getName());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(300, bow.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(500, bow.getSellingPrice());
    }

    @Test
    public void hasStringInstrument(){
        assertEquals(violin, bow.getStringInstrument());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(200, bow.calculateMarkup(), 0.01);
    }
}