import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        if (val == null) {
            return 0;
        }
        long longVal = val;
        if (longVal > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (longVal < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) longVal;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}