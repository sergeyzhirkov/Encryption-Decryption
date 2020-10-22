package encryptdecrypt.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputData {
    private String data = "";

    public InputData(String arg1) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arg1))) {
            data = bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public String getData() {
        return data;
    }
}
