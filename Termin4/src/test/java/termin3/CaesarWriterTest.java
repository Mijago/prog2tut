package termin3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;

public class CaesarWriterTest {
    private StringWriter sw;

    @Before
    public void setUp() {
        sw = new StringWriter();
    }

    @After
    public void tearDown() throws IOException {
        sw.close();
    }

    @Test
    public void testHallo1() throws IOException {
        CaesarWriter caesarWriter = new CaesarWriter(sw, 5);
        BufferedWriter bw = new BufferedWriter(caesarWriter);


        bw.write("Hallo");
        bw.flush();
        Assert.assertEquals("Mfqqt", sw.toString());

        caesarWriter.close();
    }

    @Test
    public void testHallo2() throws IOException {
        CaesarWriter caesarWriter = new CaesarWriter(sw, 5);
        BufferedWriter bw = new BufferedWriter(caesarWriter);


        bw.write("Ha-ll-o");
        bw.flush();
        Assert.assertEquals("Mf-qq-t", sw.toString());

        caesarWriter.close();
    }
}
