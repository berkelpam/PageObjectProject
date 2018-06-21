package pabe.com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pauljava on 15/06/2018.
 */
public class GoogleResultPage extends GoogleSearchPage {
    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "resultStats")
    private WebElement searchResults;

    @FindBy(id="searchform")
    private WebElement searchForm;

    @FindBy(id="hplogo")
    private WebElement googleLogo;

    public boolean isInitialized() {
        return this.searchForm.isDisplayed();
    }

    public boolean returnedResults(){
        return searchResults.isEnabled();
    }


    public boolean searchFormVisible(){
        return this.searchForm.isDisplayed();
    }
}
