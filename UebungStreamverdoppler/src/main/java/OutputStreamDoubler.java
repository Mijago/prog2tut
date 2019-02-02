import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamDoubler extends OutputStream {
    OutputStream o1 = null;
    OutputStream o2 = null;

    OutputStreamDoubler(OutputStream o1, OutputStream o2) {
        //	Teilaufgabe	a)
        // WICHTIG: Das this bei this.o1 ist SEHR wichtig!
        this.o1 = o1;
        this.o2 = o2;
    }

    public static void main(String[] args) {
        //	Teilaufgabe	d)
        // Das TryWithResources sorgt für das automatische Schließen aller beteiligten Streams
        try (FileOutputStream fos1 = new FileOutputStream("file1");
             FileOutputStream fos2 = new FileOutputStream("file2");
             OutputStreamDoubler osd = new OutputStreamDoubler(fos1, fos2);
             OutputStreamWriter osw = new OutputStreamWriter(osd)) {
            osw.write("Hello World");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void close() throws IOException {
        //	Teilaufgabe	b)
        // Da eventuelle Exceptions einfach propagiert werden und bei Fehlern der zweite Stream
        // offen bleibt, ist dieser Code ausreichend.
        this.o1.close();
        this.o2.close();
    }

    public void write(int b) throws IOException {
        //	Teilaufgabe	c)
        IOException exception = null;
        try {
            o1.write(b);
        } catch (IOException e) {
            exception = e;
        }

        try {
            o2.write(b);
        } catch (IOException e) {
            exception = e;
        }

        if (exception != null) {
            throw exception;
        }
    }
}