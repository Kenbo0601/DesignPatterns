import java.io.IOException;

public class FilterInStream extends InStream {
    private InStream inStream;
    /**
     * Constructor
     * @param inStream The InStream that this object should delegate read
     * operations to.
     */
    public FilterInStream(InStream inStream) throws IOException {
        this.inStream = inStream;
    } // Constructor(InStream)

    /**
     * Read bytes from a stream of bytes and fill an array with those bytes.
     * @param array The array of bytes to fill.
     * @exception IOException  if a I/O error occurs.
     */
    public int read(byte[] array) throws IOException {
        return inStream.read(array);
    } // read(byte[])
}