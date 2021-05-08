import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
            if (list.get(list.size()-1).equals("e")) break;
        }
        Map<String, Long> map =
        list.stream()
                .flatMap(s -> Arrays.asList(s.split("[^A-Za-z0-9]")).stream())
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                ;
        map.keySet().stream()
                .filter(x -> !x.equals(""))
                .sorted(Comparator.comparingLong(x -> (-1) * map.get(x)).thenComparing(x -> (String) x))
                .limit(10)
                .forEach(System.out::println);

    }
}