package pabe.com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pauljava on 22/06/2018.
 */
public class RabobankHomePage extends PageObject{
    public RabobankHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (className = "homepage")
    private WebElement homePage;

    public boolean isInitialized(){
        return this.homePage.isDisplayed();
    }
}
