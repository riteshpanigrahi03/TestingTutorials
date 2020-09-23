import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class VoidMethodTest {
    VoidMethodClass listPersons = new VoidMethodClass();

    @Before
    public void initialize(){
        listPersons.add("Dhoni");
        listPersons.add("Virat");
        listPersons.add("Raina");
    }
    @After
    public  void destroy(){
        listPersons.removeAll();
    }
    @Test
    public  void testSizeMethod(){
        int expected = 3;
        Assert.assertEquals(expected,listPersons.size());
    }
    @Test
    public void testAddMethod(){
        listPersons.add("ABD");
        int expected = 4;
        Assert.assertEquals(expected,listPersons.size());

    }
    @Test
    public void testRemoveMethod(){
        listPersons.remove("Raina");
        int expected = 2;
        Assert.assertEquals(expected,listPersons.size());
    }
    @Test(expected = NoSuchElementException.class)
    public void testRemoveMethodException(){
        listPersons.remove("Rohit");
        int expected = 2;
        Assert.assertEquals(expected,listPersons.size());

    }


}
