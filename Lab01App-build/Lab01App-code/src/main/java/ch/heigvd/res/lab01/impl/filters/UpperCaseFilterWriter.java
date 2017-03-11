package ch.heigvd.res.lab01.impl.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Olivier Liechti
 */
public class UpperCaseFilterWriter extends FilterWriter {
    
    public UpperCaseFilterWriter(Writer wrappedWriter) {
        super(wrappedWriter);
    }
    
    @Override
    public void write(String str, int off, int len) throws IOException {
        super.write(str.toUpperCase(), off, len);
    }
    
    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        char[] tmp = new char[cbuf.length];
        for (int i = 0; i < cbuf.length; i++) {
            tmp[i] = Character.toUpperCase(cbuf[i]);
        }
        super.write(tmp, off, len);
    }
    
    @Override
    public void write(int c) throws IOException {
        super.write(Character.toUpperCase(c));
    }
    
}
