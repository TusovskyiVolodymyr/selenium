package bo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.DeleteMessagesPage;
import page.GmailIncomingPage;
import page.RestoreMessages;
import driver.DriverSingleton;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RestoreBO {
    private WebDriver driver = DriverSingleton.getWebDriver();
    private GmailIncomingPage incoming = new GmailIncomingPage();
    private DeleteMessagesPage messages = new DeleteMessagesPage();
    private RestoreMessages restore = new RestoreMessages();

    public void deleteAndRestore() {
        incoming.initalQuantity=incoming.checkboxOne.size();
        incoming.clickOnCheckboxes();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        messages.deleteMessage();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        restore.restoreMessages();
    }
    public void isMessagesRestore(){
        Assert.assertTrue(restore.getElement().isDisplayed());
//        Assert.assertTrue(incoming.initalQuantity==incoming.checkboxOne.size());
    }
}
