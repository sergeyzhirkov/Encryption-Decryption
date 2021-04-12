import java.util.function.LongUnaryOperator;

class Operator {

    public static LongUnaryOperator unaryOperator = x -> x + (x % 2) + 2 * ((x + 1) % 2);
}