package pabe.com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

/**
 * Created by pauljava on 15/06/2018.
 */
public class GoogleResultPage extends GoogleSearchPage {
    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "resultStats")
    private WebElement resultsPage;

    public boolean isInitialized() {
        List<WebElement> dynamicElement = driver.findElements(By.id("resultStats"));
        if (dynamicElement.size() != 0) {
            //If list size is non-zero, element is present
            System.out.println("Element present");
            return true;
        } else {
            //Else if size is 0, then element is not present
            System.out.println("Element not present");
            return false;
        }
    }
}
