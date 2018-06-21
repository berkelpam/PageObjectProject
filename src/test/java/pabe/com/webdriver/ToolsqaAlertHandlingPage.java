package pabe.com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pauljava on 21/06/2018.
 */
public class ToolsqaAlertHandlingPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"content\"]/p[4]/button")
    private WebElement simpleAlertButton;

    public ToolsqaAlertHandlingPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized(){
        return this.simpleAlertButton.isDisplayed();
    }

}
