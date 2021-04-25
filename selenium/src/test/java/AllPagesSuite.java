import impl.MainPageTest;
import impl.ProductPageTest;
import impl.ResultPageTest;
import impl.SomeProductPageTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MainPageTest.class,
        ProductPageTest.class,
        ResultPageTest.class,
        SomeProductPageTest.class
})
public class AllPagesSuite {
}
