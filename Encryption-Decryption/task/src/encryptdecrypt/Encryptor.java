package encryptdecrypt;

public class Encryptor {
    private String message;
    private int key;
    private static final String ENGLISH_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public Encryptor(String message, int key) {
        this.message = message;
        this.key = key;
    }

    public String getEncryptMessage() {
        encrypte();
        return message;
    }

    private void encrypte() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            sb.append((char) (message.charAt(i) + key));
        }
        message = sb.toString().replace('|','\\');
    }
}
