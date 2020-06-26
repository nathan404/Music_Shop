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
        cello = new Cello("Yamaha", MaterialType.WILLOW, 800, 1200, 4, true, CelloType.PERFORMER, StringType.GUT);
    }

    @Test
    public void hasName(){
        assertEquals("Yamaha", cello.getName());
    }


}