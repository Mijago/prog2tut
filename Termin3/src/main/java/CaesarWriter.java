
import java.io.IOException;
import java.io.Writer;

public class CaesarWriter extends Writer {
    private Writer writer = null;
    private int steps = 0;

    public CaesarWriter(Writer writer, int steps) {
        this.writer = writer;
        this.steps = steps;
    }

    @Override
    public void write(int c) throws IOException {
        this.writer.write(c);
    }

    @Override
    public void write(char[] cbuf) throws IOException {
        this.writer.write(cbuf);
    }

    @Override
    public void write(String str) throws IOException {
        this.writer.write(str);
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        this.writer.write(str, off, len);
    }

    @Override
    public Writer append(CharSequence csq) throws IOException {
        return this.writer.append(csq);
    }

    @Override
    public Writer append(CharSequence csq, int start, int end) throws IOException {
        return this.writer.append(csq, start, end);
    }

    @Override
    public Writer append(char c) throws IOException {
        return this.writer.append(c);
    }

    /**
     * We only modify the cbuf and then give it to the original writer.
     *
     * @param cbuf The buffer which should be written.
     * @param off  The offset - where should it be written`?
     * @param len  The length of the cbuf.
     * @throws IOException
     */
    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        // Manipulate the cbuf regarding the rules
        for (int i = 0; i < cbuf.length; i++) {
            char current = cbuf[i];
            // Do the CAESAR magic!
            if (current >= 'a' && current <= 'z') {
                current += steps;
                if (current > 'z') {
                    current -= 26;
                }
            } else if (current >= 'A' && current <= 'Z') {
                current += steps;
                if (current > 'Z') {
                    current -= 26;
                }
            }

            cbuf[i] = current;
        }

        // give the modified cbuf to the original writer
        this.writer.write(cbuf, off, len);
    }

    @Override
    public void flush() throws IOException {
        this.writer.flush();
    }

    @Override
    public void close() throws IOException {
        this.writer.close();
    }
}