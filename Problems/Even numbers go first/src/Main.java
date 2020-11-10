import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = scanner.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < countNumbers; i++) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                deque.offerFirst(number);
            } else {
                deque.offerLast(number);
            }
        }
        deque.forEach(e -> System.out.println(e));
    }
}