package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import driver.DriverSingleton;
import wrappers.Button;
import wrappers.DecoratedField;

public class DeleteMessagesPage {
    @FindBy(xpath = "//*[@id=\":5\"]/div/div[1]/div[1]/div/div/div[2]/div[3]")
     protected Button deleteButton ;

    public DeleteMessagesPage(){
        WebDriver driver = DriverSingleton.getWebDriver();
        PageFactory.initElements( new DecoratedField(new DefaultElementLocatorFactory(driver)),this);
    }

    public void deleteMessage(){
        deleteButton.click();
    }

    public boolean isDeleted(int initalQuantity,int listSize){
        if (initalQuantity==listSize)return false;
        else return true;
    }
}
