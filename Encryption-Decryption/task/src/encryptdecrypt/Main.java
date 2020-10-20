package encryptdecrypt;

import encryptdecrypt.data.Operation;
import encryptdecrypt.data.Parser;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser(args);

        if (parser.getMode() == Operation.ENC) {
            Encryptor encryptor = new Encryptor(parser.getData(), parser.getKey());
            System.out.println(encryptor.getEncryptMessage());
        }
        if (parser.getMode() == Operation.DEC) {
            Decryptor decryptor = new Decryptor(parser.getData(), parser.getKey());
            System.out.println(decryptor.getDecryptMessage());
        }

    }

}
