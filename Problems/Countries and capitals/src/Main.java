import java.util.*;


class MapFunctions {

    public static void putThreeCountries(Map<String, String> map) {
        map.put("Russia", "Moscow");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] pair = s.split(" ");
            map.put(pair[0], pair[1]);
        }

        MapFunctions.putThreeCountries(map);

        System.out.println(map.size());
    }
}