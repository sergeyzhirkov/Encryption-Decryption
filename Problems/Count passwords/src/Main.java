import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static long countPasswords(Stream<String> passwordStream) {
        return passwordStream.count();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countPasswords(Arrays.stream(scanner.nextLine().split("\\s+"))));
    }
}