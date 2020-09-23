import org.junit.*;

import java.net.StandardSocketOptions;

public class TestCalc {
    @Test
    public void testSum(){
        System.out.println("add test");
        Calculate c= new Calculate();
        int a=4;
        int b =5;
        int actual =c.add(a,b) ;
        int expected =9;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testDiff(){
        Calculate c= new Calculate();
        System.out.println("sub test");
        int a=4;
        int b =5;
        int actual =c.diff(a,b) ;
        int expected =-1;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testMultiply(){
        Calculate c= new Calculate();
        System.out.println("Multiply test");
        int a=4;
        int b =5;
        int actual =c.multiply(a,b) ;
        int expected =20;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testDiv(){
        Calculate c= new Calculate();
        System.out.println("Division test");
        int a=10;
        int b =5;
        float actual =c.div(a,b);
        float expected =2;
        Assert.assertEquals(expected, actual,0.0001);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivWithZeroAsDenominator(){
        System.out.println("Denominator cannot be zero");
        int a=10;
        int b=0;
        Calculate c= new Calculate();
        c.div(a,b);
        System.out.println("Denominator cannot be zero");


    }

    @Before
    public void runBeforeEveryTest(){
        System.out.println("@before running");
    }
    @After
    public void runAfterEveryTest(){
        System.out.println("@after running");
    }
    @BeforeClass
    public static void runBeforeClass(){
        System.out.println("@beforeclass running");
    }
    @AfterClass
    public static void runAfterClass(){
        System.out.println("@afterclass running");
    }
}
