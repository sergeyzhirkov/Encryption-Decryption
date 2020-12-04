package encryptdecrypt.decryption;

public class DecryptUnicode implements DecryptMethod {
    @Override
    public StringBuilder dec(String message, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            stringBuilder.append((char) (message.charAt(i) - key));
        }
        return stringBuilder;
    }
}
