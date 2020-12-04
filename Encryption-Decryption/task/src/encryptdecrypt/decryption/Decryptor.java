package encryptdecrypt.decryption;

import encryptdecrypt.data.Algorithm;

public class Decryptor {
    private String message;
    private int key;
    private Algorithm alg;

    public Decryptor(String message, int key, Algorithm alg) {
        this.message = message;
        this.key = key;
        this.alg = alg;
    }

    public String getDecryptMessage() {
        decrypt();
        return message;
    }

    private void decrypt() {
        DecryptMethod decryptMethod;
        if (alg == Algorithm.SHIFT) {
            decryptMethod = new DecryptShift();
        } else {
            decryptMethod = new DecryptUnicode();
        }
        message = decryptMethod.dec(message, key).toString();
    }
}
