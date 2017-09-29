package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import driver.DriverSingleton;
import wrappers.Button;
import wrappers.DecoratedField;

public class RestoreMessages {
    @FindBy(xpath = "//*[@id=\"link_undo\"]")
    Button restore;

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[1]/div[5]/div[1]/div/div[3]/div/div/div[2]/span")
    WebElement element;

    public WebElement getElement() {
        return element;
    }

    public RestoreMessages() {
        WebDriver driver = DriverSingleton.getWebDriver();
        PageFactory.initElements( new DecoratedField(new DefaultElementLocatorFactory(driver)),this);
    }
    public void restoreMessages(){
        restore.click();

    }
}
