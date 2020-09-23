import org.junit.Assert;
import org.junit.Test;
public class TestCalc {
    @Test
    public void testSum(){
        Calculate c= new Calculate();
        int a=4;
        int b =5;
        int actual =c.add(a,b) ;
        int expected =9;
        Assert.assertEquals(expected,actual);
    }
}
