import accessories.Bow;
import accessories.SheetMusic;
import behaviours.ISell;
import enums.*;
import instruments.Cello;
import instruments.Guitar;
import instruments.Piano;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private ArrayList<ISell> stock;
    private Piano piano;
    private Guitar guitar;
    private Violin violin;
    private Bow bow;
    private SheetMusic sheetMusic;
    private Shop shop;

    @Before
    public void before(){
        piano = new Piano("Bechstein", MaterialType.PINE, 4000, 6000, PianoType.GRAND, 88);
        guitar = new Guitar("Gibson Les Paul", MaterialType.MAHOGANY, 1500, 2000, GuitarType.ELECTRIC, GuitarStringType.STEEL_NICKEL);
        violin = new Violin("Mendini", MaterialType.SPRUCE, 6000, 8000, ViolinType.CLASSICAL, StringType.GUT);
        bow = new Bow("Beginner's Bow", 300, 500, violin);
        sheetMusic = new SheetMusic("Romance Larghetto", 6, 10, "Chopin", 5, piano);
        stock = new ArrayList<ISell>();
        Collections.addAll(stock, piano, guitar, violin, bow, sheetMusic);
        shop = new Shop("Mikey's Music Shop", 20000, stock);
    }

    @Test
    public void hasName(){
        assertEquals("Mikey's Music Shop", shop.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(20000, shop.getTill());
    }

    @Test
    public void hasStock(){
        assertEquals(5, shop.getStockCount());
    }

    @Test
    public void canAddToStock(){
        Cello cello = new Cello("Yamaha", MaterialType.WILLOW, 800, 1200, CelloType.PERFORMER, StringType.GUT);
        shop.addToStock(cello);
        assertEquals(6, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.removeFromStock(violin);
        assertEquals(4, shop.getStockCount());
    }

}