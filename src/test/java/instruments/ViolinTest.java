package instruments;

import enums.MaterialType;
import enums.StringType;
import enums.ViolinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    private Violin violin;

    @Before
    public void before(){
        violin = new Violin("Stradivarius", MaterialType.SPRUCE, 1000000, 2000000, ViolinType.CLASSICAL, StringType.GUT);
    }

    @Test
    public void hasName(){
        assertEquals("Stradivarius", violin.getName());
    }

    @Test
    public void hasMaterialType(){
        assertEquals(MaterialType.SPRUCE, violin.getMaterialType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(1000000, violin.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(2000000, violin.getSellingPrice());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void hasBow(){
        assertEquals(true, violin.hasBow());
    }

    @Test
    public void hasViolinType(){
        assertEquals(ViolinType.CLASSICAL, violin.getViolinType());
    }

    @Test
    public void hasStringType(){
        assertEquals(StringType.GUT, violin.getStringType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1000000, violin.calculateMarkup(), 0.01);
    }
}