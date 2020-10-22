package encryptdecrypt.data;

import encryptdecrypt.io.InputData;
import encryptdecrypt.io.OutputData;

public class Parser {
    private String[] args;
    private Operation mode = Operation.ENC;
    private int key = 0;
    private String data = "";
    private OutputData outputData;
    private InputData inputData;

    public Parser(String[] args, OutputData outputData) {
        this.args = args;
        this.outputData = outputData;
        parseStringArgs();
    }

    private void parseStringArgs() {
        for (int i = 0; i < args.length / 2; i++) {
            parseArg(args[i * 2], args[i * 2 + 1]);
        }
    }

    private void parseArg(String arg, String arg1) {
        if (arg.equals("-mode")) {
            mode = Operation.getOperation(arg1);
        }
        if (arg.equals("-key")) {
            key = Integer.parseInt(arg1);
        }
        if (arg.equals("-data")) {
            data = arg1;
        }
        if (arg.equals("-out")) {
            outputData.setFile(arg1);
        }
        if (arg.equals("-in")) {
            inputData = new InputData(arg1);
            if (data.equals("")) {
                data = inputData.getData();
            }
        }
    }

    public Operation getMode() {
        return mode;
    }

    public int getKey() {
        return key;
    }

    public String getData() {
        return data;
    }
}
