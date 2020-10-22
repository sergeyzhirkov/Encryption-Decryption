import java.util.Scanner;

class Main {
    public static void decomposition(int n, int max, StringBuilder sb) {
        if (n < 0) {
            return;
        }
        if (n == 0) {
            System.out.println(sb.toString());
            return;
        }
        if (n == 1) {
            System.out.println(sb.toString() + "1");
            return;
        } else {
            for (int i = 1; i <= max; i++) {
                decomposition(n - i, i, new StringBuilder(sb.toString()).append(i).append(" "));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        decomposition(test, test, new StringBuilder());
    }
}