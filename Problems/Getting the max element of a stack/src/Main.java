import java.util.*;

class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int numberCommands = Integer.parseInt(scanner.nextLine());
        Deque<Integer> maxDeque = new ArrayDeque<>(List.of(0));
        for (int i = 0; i < numberCommands; i++) {
            String input = scanner.nextLine();
            switch (input.split(" ")[0]) {
                case "push":
                    deque.offerLast(Integer.parseInt(input.split(" ")[1]));
                    if (maxDeque.peekLast() <= deque.peekLast()) {
                        maxDeque.offerLast(deque.peekLast());
                    } else {
                        maxDeque.offerLast(maxDeque.peekLast());
                    }
                    break;
                case "pop":
                    deque.pollLast();
                    maxDeque.pollLast();
                    break;
                case "max":
                    System.out.println(maxDeque.peekLast());
                    break;
            }
        }
    }
}