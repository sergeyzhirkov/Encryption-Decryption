package encryptdecrypt.decryption;

public class DecryptShift implements DecryptMethod {
    private static final String ENGLISH_ALPHABET_L = "abcdefghijklmnopqrstuvwxyz";
    private static final String ENGLISH_ALPHABET_U = "abcdefghijklmnopqrstuvwxyz".toUpperCase();

    @Override
    public StringBuilder dec(String message, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int position = (ENGLISH_ALPHABET_L.indexOf(ch) - key + ENGLISH_ALPHABET_L.length()) % ENGLISH_ALPHABET_L.length();
                ch = ENGLISH_ALPHABET_L.charAt(position);
            } else if (ch >= 'A' && ch <= 'Z') {
                int position = (ENGLISH_ALPHABET_U.indexOf(ch) - key + ENGLISH_ALPHABET_U.length()) % ENGLISH_ALPHABET_U.length();
                ch = ENGLISH_ALPHABET_U.charAt(position);
            }
            sb.append(ch);
        }
        return sb;
    }
}
