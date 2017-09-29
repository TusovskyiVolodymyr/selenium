import listener.TestNgListener;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNgListener.class)
public class SecondTest {
    Main main;
    @BeforeMethod
    public void init(){
        main = new Main();
    }
    @Test
    public void secondTest(){
        Assert.assertSame(main.multiply(7,3),10);
    }
}
