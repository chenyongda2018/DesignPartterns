package 过滤输入流;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 过滤掉输入流中的小写字符
 */
public class UpperCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected UpperCaseInputStream(InputStream in)  {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toUpperCase((char) c);
    }


    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);

        for (int i = 0; i < result; i++) {
            b[i] = (byte) Character.toUpperCase((char) (b[i]));//转为大写
        }

        return result;
    }


}
