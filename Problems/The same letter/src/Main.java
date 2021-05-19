import java.util.*;


class MapFunctions {

    public static void printWithSameLetter(Map<String, String> map) {
        String countryKey = map.keySet().stream()
                .filter(key -> map.get(key).charAt(0) == key.charAt(0))
                .limit(1)
                .min(Comparator.naturalOrder()).get();
        System.out.println(countryKey + " " + map.get(countryKey));
    }
}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] pair = s.split(" ");
            map.put(pair[0], pair[1]);
        }

        MapFunctions.printWithSameLetter(map);
    }
}