import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void iterateOverList(ListIterator<String> iter) {
        while (iter.hasNext()) {
            String string = iter.next();
            if (string.equals("Hip")) {
                iter.add("Hop");
            }
        }
    }

    public static void printList(ListIterator<String> iter) {
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        iterateOverList(list.listIterator());
        printList(list.listIterator());
    }
}