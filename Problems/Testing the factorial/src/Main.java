//public class FactorialTest {
//
//    private final Factorial factorial = new Factorial();
//
//    @Test
//    public void testNegativeCase() {
//        Assert.assertEquals(-1, factorial.get(-1));
//    }
//
//    @Test
//    public void testGetCase0() {
//        Assert.assertEquals(1, factorial.get(0));
//    }
//
//    @Test
//    public void testGetCase1() {
//        Assert.assertEquals(1, factorial.get(1));
//    }
//
//    @Test
//    public void testGetCase2() {
//        Assert.assertEquals(2, factorial.get(2));
//    }
//
//    @Test
//    public void testGetCase5() {
//        Assert.assertEquals(120, factorial.get(5));
//    }
//}

//public long get(int x){
//        if(x< 0)return-1;
//        if(x==0)return 1;
//        long result=1;
//        for(int i=1; i<=x; i++){
//            result *= i;
//        }
//        return result;
//}