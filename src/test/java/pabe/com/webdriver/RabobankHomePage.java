package pabe.com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pauljava on 22/06/2018.
 */
public class RabobankHomePage extends PageObject{

    private static String PAGETITLE="Overstappen naar de Rabobank - Rabobank";

    public RabobankHomePage(WebDriver driver) {
        super(driver);
        driver.navigate().to("https://www.rabobank.nl/particulieren/");
//        isPageTitleCorrect(PAGETITLE);
    }

    @FindBy (className = "homepage")
    private WebElement homePage;

    @FindBy (linkText = "Verzekeringen die passen bij uw situatie")
    private WebElement linkVerzekeren;

    @FindBy(id="ra_searchfield")
    private WebElement searchbox;

    @FindBy(id="lnk_57819_1220d.4b8.128dea27.107bd9d7")
    private WebElement overstapServiceLink;

    public boolean isInitialized(){
        return this.homePage.isDisplayed();
    }

    public void clickLinkVerzekeren(){
        this.linkVerzekeren.click();
    }

    public void clickSearchBox(){
        this.searchbox.click();
    }

    public void clickOverstapService(){
        this.overstapServiceLink.click();
    }

//    private boolean isPageTitleCorrect(String pageTitle){
//        return
//    }
}
