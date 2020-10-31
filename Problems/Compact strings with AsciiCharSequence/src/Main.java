import java.nio.charset.StandardCharsets;
import java.util.*;

class AsciiCharSequence implements CharSequence {
    private byte[] value;

    public AsciiCharSequence(byte[] array) {
        value = array;
    }

    @Override
    public String toString() {
        return new String(value, StandardCharsets.UTF_8);
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int i) {
        return (char) value[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return new AsciiCharSequence(Arrays.copyOfRange(value, i, i1));
    }
}