import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextLine());
        }
        int count = Integer.parseInt(scanner.nextLine());
        Collections.rotate(list, count);
        for (String s : list) {
            System.out.println(s);
        }

    }
}