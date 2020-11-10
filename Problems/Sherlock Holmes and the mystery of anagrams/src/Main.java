import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine().toLowerCase();
        String secondString = scanner.nextLine().toLowerCase();
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();
        for (int i = 0; i < firstString.length(); i++) {
            if (!firstMap.containsKey(firstString.charAt(i))) {
                firstMap.put(firstString.charAt(i), 1);
            } else {
                firstMap.put(firstString.charAt(i), firstMap.get(firstString.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < secondString.length(); i++) {
            if (!secondMap.containsKey(secondString.charAt(i))) {
                secondMap.put(secondString.charAt(i), 1);
            } else {
                secondMap.put(secondString.charAt(i), secondMap.get(secondString.charAt(i)) + 1);
            }
        }
        if (Objects.equals(firstMap, secondMap)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}