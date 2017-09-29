import listener.TestNgListener;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListener.class)
public class FirstTest {
    Main main;
    @BeforeMethod
    public void init(){
        main = new Main();
    }
    @Test
    public void test(){
       Assert.assertSame(main.add(7,3),10);
    }

}
