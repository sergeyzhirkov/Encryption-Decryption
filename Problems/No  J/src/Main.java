import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String line = listIterator.next();
            if (!line.startsWith("J")) {
                listIterator.remove();
            } else {
                listIterator.set(line.substring(1));
            }
        }
        Collections.reverse(list);
        list.forEach(e -> System.out.println(e));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}