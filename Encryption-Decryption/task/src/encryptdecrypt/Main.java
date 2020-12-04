package encryptdecrypt;

import encryptdecrypt.data.Operation;
import encryptdecrypt.data.Parser;
import encryptdecrypt.decryption.Decryptor;
import encryptdecrypt.encryption.Encryptor;
import encryptdecrypt.io.OutputData;

public class Main {
    public static void main(String[] args) {
        OutputData outputData = new OutputData();
        Parser parser = new Parser(args, outputData);

        if (parser.getMode() == Operation.ENC) {
            Encryptor encryptor = new Encryptor(parser.getData(), parser.getKey(), parser.getAlg());
            outputData.println(encryptor.getEncryptMessage());
        }
        if (parser.getMode() == Operation.DEC) {
            Decryptor decryptor = new Decryptor(parser.getData(), parser.getKey(), parser.getAlg());
            outputData.println(decryptor.getDecryptMessage());
        }

    }

}
