package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        String input = scanner.nextLine();
        int key = scanner.nextInt();
        if (operation.equals("enc")) {
            Encryptor encryptor = new Encryptor(input, key);
            System.out.println(encryptor.getEncryptMessage());
        }
        if (operation.equals("dec")) {
            Decryptor decryptor = new Decryptor(input, key);
            System.out.println(decryptor.getDecryptMessage());
        }

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
