package encryptdecrypt;

public class Decryptor {
    private String message;
    private int key;

    public Decryptor(String message, int key) {
        this.message = message;
        this.key = key;
    }

    public String getDecryptMessage() {
        decrypt();
        return message;
    }

    private void decrypt() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            stringBuilder.append((char) (message.charAt(i) - key));
        }
        message = stringBuilder.toString();
    }
}
