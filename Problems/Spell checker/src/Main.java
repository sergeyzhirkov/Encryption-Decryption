import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = Integer.parseInt(scanner.nextLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < d; i++) {
            set.add(scanner.nextLine().toLowerCase());
        }
        d = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < d; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (String s : input) {
                if (!set.contains(s.toLowerCase())) {
                    System.out.println(s);
                    set.add(s.toLowerCase());
                }
            }
        }
    }
}