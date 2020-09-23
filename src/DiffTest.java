import org.junit.Assert;
import org.junit.Test;

public class DiffTest {
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
}
