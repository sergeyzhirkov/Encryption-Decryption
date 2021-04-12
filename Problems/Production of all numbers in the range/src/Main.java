import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (leftBorder, rightBorder) -> {
        long mult = 1;
        for (long i = leftBorder; i <= rightBorder; i++) {
            mult *= i;
        }
        return mult;
    };
}