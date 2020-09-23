import org.junit.Assert;
import org.junit.Test;

public class DivTest {
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
       // System.out.println("Denominator cannot be zero");
        int a=10;
        int b=0;
        Calculate c= new Calculate();
        c.div(a,b);
        System.out.println("Denominator cannot be zero");

    }
}

