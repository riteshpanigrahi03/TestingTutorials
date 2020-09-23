import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddTest.class,
        DiffTest.class,
        MultiplyTest.class,
        DivTest.class,
})
public class TestSuite {
}
