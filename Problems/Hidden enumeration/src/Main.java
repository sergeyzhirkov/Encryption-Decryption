import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.stream(Secret.values())
                .filter(secret -> secret.name().startsWith("STAR"))
                .count());
    }
}

//sample enum for inspiration
enum Secret {
    STAR, CRASH, START, // ...
}
