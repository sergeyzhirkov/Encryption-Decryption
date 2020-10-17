package encryptdecrypt;

public class Encryptor {
    private String message;
    private int key;
    private static final String ENGLISH_ALPHABET = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";

    public Encryptor(String message, int key) {
        this.message = message.toLowerCase();
        this.key = key;
    }

    public String getEncryptMessage() {
        encrypte();
        return message;
    }

    private void encrypte() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (ENGLISH_ALPHABET.indexOf(message.charAt(i)) != -1) {
                sb.append(ENGLISH_ALPHABET.charAt(ENGLISH_ALPHABET.indexOf(message.charAt(i)) + key));
            } else {
                sb.append(message.charAt(i));
            }
        }
        message = sb.toString();
    }
}
