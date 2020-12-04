package encryptdecrypt.encryption;

import encryptdecrypt.data.Algorithm;

public class Encryptor {
    private String message;
    private int key;
    private Algorithm alg;

    public Encryptor(String message, int key, Algorithm alg) {
        this.message = message;
        this.key = key;
        this.alg = alg;
    }

    public String getEncryptMessage() {
        encrypte();
        return message;
    }

    private void encrypte() {
        EncryptMethod encryptMethod;
        if (alg == Algorithm.SHIFT) {
            encryptMethod = new EncryptShift();
        } else {
            encryptMethod = new EncryptUnicode();
        }
        message = encryptMethod.enc(message, key).toString().replace('|','\\');
    }
}
