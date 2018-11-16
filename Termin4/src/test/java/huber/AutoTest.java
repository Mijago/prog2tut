package huber;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AutoTest {
    Auto testAuto;

    @Before
    public void setUp() throws Exception {
        testAuto = new Auto(12, 1998, "Porsche", "911", "WÜ AB 12");
    }

    @After
    public void tearDown() throws Exception {
        testAuto = null;
    }

    @Test
    public void testToStringMethod() {
        Assert.assertEquals(
                "Auto{PS=12, Baujahr=1998, Marke='Porsche', Modell='911', Kennzeichen='WÜ AB 12'}",
                testAuto.toString()
        );
    }
}
