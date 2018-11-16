import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

/*
    Short summary for Decorators:
    It DECORATES the given instance by forwarding all methods and values directly to it.
    Only when something has to be changed (like the b -> B) we change this specific method.
 */


/**
 * Decorates Reader.
 * Modifies b -> B (hence B2BReader)
 */
public class B2BReader extends Reader {
    private Reader reader = null;

    public B2BReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public int read(CharBuffer target) throws IOException {
        return this.reader.read(target);
    }

    @Override
    public int read() throws IOException {
        return this.reader.read();
    }

    @Override
    public int read(char[] cbuf) throws IOException {
        return this.reader.read(cbuf);
    }

    // Notice that we only change this method.
    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        int bytesRead = this.reader.read(cbuf, off, len);
        for (int i = 0; i < cbuf.length; i++) {
            if (cbuf[i] == 'b')
                cbuf[i] = 'B';
        }
        return bytesRead;
    }

    @Override
    public long skip(long n) throws IOException {
        return this.reader.skip(n);
    }

    @Override
    public boolean ready() throws IOException {
        return this.reader.ready();
    }

    @Override
    public boolean markSupported() {
        return this.reader.markSupported();
    }

    @Override
    public void mark(int readAheadLimit) throws IOException {
        this.reader.mark(readAheadLimit);
    }

    @Override
    public void reset() throws IOException {
        this.reader.reset();
    }

    @Override
    public void close() throws IOException {
        this.reader.close();
    }
}