import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Long> map = Arrays.stream(sc.nextLine().toLowerCase().split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}