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
