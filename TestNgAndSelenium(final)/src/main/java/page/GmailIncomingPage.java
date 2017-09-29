package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverSingleton;

import java.util.List;
public class GmailIncomingPage {
    @FindAll(@FindBy(xpath = "//div[@role=\"checkbox\"]"))
    public List<WebElement> checkboxOne;

    public  int initalQuantity;

    public GmailIncomingPage(){
        WebDriver driver = DriverSingleton.getWebDriver();
        PageFactory.initElements(driver,this);
    }

    public void clickOnCheckboxes(){
        int i = 0;
        for (WebElement el:checkboxOne) {
            el.click();
            i++;
            if (i==3) break;
        }
    }

}
