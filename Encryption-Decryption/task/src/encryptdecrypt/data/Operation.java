package encryptdecrypt.data;

public enum Operation {
    ENC, DEC;

    public static Operation getOperation(String stringOperation) {
        if (stringOperation.equals("enc")) {
            return ENC;
        } else {
            return DEC;
        }
    }
}
