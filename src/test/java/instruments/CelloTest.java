package instruments;

import enums.CelloType;
import enums.MaterialType;
import enums.StringType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    private Cello cello;

    @Before
    public void before(){
        cello = new Cello("Yamaha", MaterialType.WILLOW, 800, 1200, CelloType.PERFORMER, StringType.GUT);
    }

    @Test
    public void hasName(){
        assertEquals("Yamaha", cello.getName());
    }

    @Test
    public void hasMaterialType(){
        assertEquals(MaterialType.WILLOW, cello.getMaterialType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(800, cello.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(1200, cello.getSellingPrice());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(4, cello.getNumberOfStrings());
    }

    @Test
    public void hasBow(){
        assertEquals(true, cello.hasBow());
    }

    @Test
    public void hasCelloType(){
        assertEquals(CelloType.PERFORMER, cello.getCelloType());
    }

    @Test
    public void hasStringType(){
        assertEquals(StringType.GUT, cello.getStringType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(400, cello.calculateMarkup(), 0.01);
    }

    @Test
    public void canSetSellingPrice(){
        cello.setSellingPrice(1500);
        assertEquals(1500, cello.getSellingPrice());
        assertEquals(700, cello.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Bumbumbum", cello.play());
    }

}