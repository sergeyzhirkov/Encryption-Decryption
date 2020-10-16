package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        System.out.println(encryptString("we found a treasure!".toLowerCase()));
    }

    private static String encryptString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                stringBuilder.append((char) ('z' - input.charAt(i) + 'a'));
            } else {
                stringBuilder.append(input.charAt(i));
            }

        }
        return stringBuilder.toString();
    }
}
