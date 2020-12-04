package encryptdecrypt.encryption;

public class EncryptUnicode implements EncryptMethod{
    @Override
    public StringBuilder enc(String message, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            sb.append((char) (message.charAt(i) + key));
        }
        return sb;
    }
}
