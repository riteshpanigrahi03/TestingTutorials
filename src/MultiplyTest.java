import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {
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
}
