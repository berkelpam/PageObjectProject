package pabe.com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pauljava on 15/06/2018.
 */
public class GoogleSearchPage extends PageObject{

    @FindBy(name="q")
    private WebElement searchBox;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
//        this.searchBox = searchBox;
    }

    public void searchFor(String text) {
        // We continue using the element just as before
        searchBox.sendKeys(text);
        searchBox.submit();
    }
}