package encryptdecrypt.encryption;

public interface EncryptMethod {
    StringBuilder enc(String message, int key);
}
