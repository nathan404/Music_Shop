package instruments;

import enums.GuitarStringType;
import enums.GuitarType;
import enums.MaterialType;
import enums.StringType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Gibson Les Paul", MaterialType.MAHOGANY, 1500, 2000, GuitarType.ELECTRIC, GuitarStringType.STEEL_NICKEL);
    }

    @Test
    public void hasName(){
        assertEquals("Gibson Les Paul", guitar.getName());
    }

    @Test
    public void hasMaterialType(){
        assertEquals(MaterialType.MAHOGANY, guitar.getMaterialType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(1500, guitar.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(2000, guitar.getSellingPrice());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void doesntHaveBow(){
        assertEquals(false, guitar.hasBow());
    }

    @Test
    public void hasGuitarType(){
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }

    @Test
    public void hasGuitarStringType(){
        assertEquals(GuitarStringType.STEEL_NICKEL, guitar.getGuitarStringType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(500, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canSetSellingPrice(){
        guitar.setSellingPrice(2500);
        assertEquals(2500, guitar.getSellingPrice());
        assertEquals(1000, guitar.calculateMarkup(), 0.01);
    }
}