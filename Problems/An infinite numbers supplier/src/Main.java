import java.util.function.*;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        int count[] = {0};
        return () -> count[0]++;
    }

}