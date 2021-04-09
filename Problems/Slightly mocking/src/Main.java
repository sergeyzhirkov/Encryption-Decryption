//public class CalculatorTest {
//
//    @Mock
//    private CalculatorEngine engine = Mockito.mock(CalculatorEngine.class);
//
//    private Calculator calculator = new Calculator(engine);
//
//    @Test
//    public void testDivideCase01() {
//        Mockito.when(engine.divide(0, 1)).thenReturn(0);
//        Assert.assertEquals("Division of 0 by 1 = 0", calculator.divide(0, 1));
//    }
//
//    @Test
//    public void testDivideCase11() {
//        Mockito.when(engine.divide(1, 1)).thenReturn(1);
//        Assert.assertEquals("Division of 1 by 1 = 1", calculator.divide(1, 1));
//    }
//
//    @Test
//    public void testDivideCase12() {
//        Mockito.when(engine.divide(1, 2)).thenReturn(0);
//        Assert.assertEquals("Division of 1 by 2 = 0", calculator.divide(1, 2));
//    }
//
//    @Test
//    public void testDivideCaseZeroDivider() {
//        Mockito.when(engine.divide(1, 0)).thenThrow(new ArithmeticException());
//        Assert.assertEquals("Division by zero is prohibited", calculator.divide(1, 0));
//    }
//}


class Calculator {
    private CalculatorEngine engine;

    public Calculator(CalculatorEngine engine) {
        this.engine = engine;
    }

    public String divide(int a, int b) {
        try {
            return String.format("Division of %d by %d = %d", a, b, engine.divide(a,b));
        } catch (ArithmeticException e) {
            return "Division by zero is prohibited";
        }
    }
}

class CalculatorEngine {

    public int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

}