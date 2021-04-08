import java.util.Scanner;
import java.util.logging.Level;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()) {
            String logLevel = sc.next();
            sum += Level.parse(logLevel.toUpperCase()).intValue();
        }
        System.out.println(sum);
    }
}