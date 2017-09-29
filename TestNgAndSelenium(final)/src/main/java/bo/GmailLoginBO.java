package bo;
import org.openqa.selenium.WebDriver;
import page.GmailLoginPage;
import driver.DriverSingleton;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GmailLoginBO {
    private WebDriver driver = DriverSingleton.getWebDriver();

    GmailLoginPage gmailLoginPage = new GmailLoginPage();
    public GmailLoginBO() throws IOException {
    }

    public  void  login(String login, String pass)  {
        gmailLoginPage.typeLoginAndSubmit(login);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        gmailLoginPage.typePasswordAndSubmit(pass);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}
