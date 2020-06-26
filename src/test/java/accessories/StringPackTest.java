package accessories;

import enums.MaterialType;
import enums.StringType;
import enums.ViolinType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringPackTest {

    private Violin violin;
    private StringPack stringPack;

    @Before
    public void before(){
        violin = new Violin("Stradivarius", MaterialType.SPRUCE, 1000000, 2000000, ViolinType.CLASSICAL, StringType.GUT);
        stringPack = new StringPack("Intermediate Strings", 200, 400, violin);
    }

    @Test
    public void hasName(){
        assertEquals("Intermediate Strings", stringPack.getName());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(200, stringPack.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(400, stringPack.getSellingPrice());
    }

    @Test
    public void hasStringInstrument(){
        assertEquals(violin, stringPack.getStringInstrument());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(200, stringPack.calculateMarkup(), 0.01);
    }

    @Test
    public void canSetSellingPrice(){
        stringPack.setSellingPrice(500);
        assertEquals(500, stringPack.getSellingPrice());
        assertEquals(300, stringPack.calculateMarkup(), 0.01);
    }
}