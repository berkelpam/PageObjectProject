package pabe.com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by pauljava on 22/06/2018.
 */
public class RabobankHomePage extends PageObject{

    private static String PAGETITLE="Overstappen naar de Rabobank - Rabobank";

    public RabobankHomePage(WebDriver driver) {
        super(driver);
        driver.navigate().to("https://www.rabobank.nl/particulieren/");
        waitForClassNameVisible("homepage");
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

    public void waitForCssVisible(String css) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css))));
    }

    public void waitForIdVisible(String id) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated(By.id(id))));
    }

    public void waitForClassNameVisible(String className) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated(By.className(className))));
    }
}
