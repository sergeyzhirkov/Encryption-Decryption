import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Utils {

    public static void sortStrings(List<String> strings) {
        Collections.sort(strings, Comparator.reverseOrder());
    }
}