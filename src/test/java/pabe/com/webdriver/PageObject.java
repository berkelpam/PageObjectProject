package pabe.com.webdriver;

/**
 * Created by pauljava on 14/06/2018.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
    protected WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForClassNameVisible(String className) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated(By.className(className))));
    }

    public String getPageTitle(){
        return this.getPageTitle();
    }
}

