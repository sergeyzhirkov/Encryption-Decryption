package encryptdecrypt.io;

import java.io.PrintStream;

public class OutputData {
    private PrintStream printStream = System.out;

    public void setFile(String arg1) {
        try {
            printStream = new PrintStream(arg1);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void println(String data) {
        printStream.println(data);
    }
}
