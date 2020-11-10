import java.util.*;
import java.util.stream.Collectors;

class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        numbers.forEach(elem -> list.add((int) Math.pow(elem, 2)));
        return list;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collection<Integer> result = CollectionUtils.pow2(numbers);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}