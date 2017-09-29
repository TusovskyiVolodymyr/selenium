package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import properties.PropertiesUtill;
import driver.DriverSingleton;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GmailLoginPage {

    private WebDriver driver = DriverSingleton.getWebDriver();
    PropertiesUtill utill = new PropertiesUtill();
    @FindBy(id = "identifierId")
    private WebElement loginInput;

    @FindBy(id = "identifierNext")
    private WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]")
    private WebElement passwordNext;

    public GmailLoginPage() throws IOException {
        WebDriver driver = DriverSingleton.getWebDriver();
            driver.get(utill.getBaseUrl());
        PageFactory.initElements(driver,this);
    }

    public void typeLoginAndSubmit(String login) {
        loginInput.sendKeys(login);
        nextButton.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }
    public void typePasswordAndSubmit(String password) {
        passwordInput.sendKeys(password);
        passwordNext.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

}
