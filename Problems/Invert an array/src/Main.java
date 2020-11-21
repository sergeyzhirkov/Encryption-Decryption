// do not remove imports
import java.util.*;
import java.util.function.Function;

class ArrayUtils {
    static <T> T[] invert(T[] t) {
        for (int i = 0; i < t.length / 2; i++) {
            T varT = t[i];
            t[i] = t[t.length - i - 1];
            t[t.length - i - 1] = varT;
        }
        return t;
    }
}