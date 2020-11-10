import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().toLowerCase().split("");
        String[] second = scanner.nextLine().toLowerCase().split("");
        int countToDelete = 0;
        Map<String, Integer> firstMap = new HashMap<>();
        Map<String, Integer> secondMap = new HashMap<>();
        Set<String> generalSet = new HashSet<>();
        for (String s : first) {
            firstMap.put(s, firstMap.getOrDefault(s, 0) + 1);
            generalSet.add(s);
        }
        for (String s : second) {
            secondMap.put(s, secondMap.getOrDefault(s, 0) + 1);
            generalSet.add(s);
        }
        for (String s : generalSet) {
            int countFirst = (firstMap.get(s) == null ? 0 : firstMap.get(s));
            int countSecond = (secondMap.get(s) == null ? 0 : secondMap.get(s));
            countToDelete += Math.abs(countFirst - countSecond);
        }
        System.out.println(countToDelete);
    }
}