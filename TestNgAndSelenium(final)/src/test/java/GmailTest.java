import bo.GmailLoginBO;
import bo.RestoreBO;
import dataProvider.DataProviderClass;
import listener.TestNgListener;
import org.testng.annotations.*;
import driver.DriverSingleton;

import javax.xml.bind.Unmarshaller;
import java.io.IOException;
@Listeners(TestNgListener.class)
public class GmailTest {

        @Test(dataProviderClass = DataProviderClass.class,dataProvider = "dataProvider")
        public void loginTest (String l, String p) throws  IOException {
             GmailLoginBO loginBO = new GmailLoginBO();
             RestoreBO restoreBO = new RestoreBO();
            loginBO.login(l,p);
            restoreBO.deleteAndRestore();
            restoreBO.isMessagesRestore();
        }
        @AfterMethod
        public void close(){
            DriverSingleton.quit();
        }
}

