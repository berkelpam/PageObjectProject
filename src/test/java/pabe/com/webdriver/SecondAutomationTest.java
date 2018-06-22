package pabe.com.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by pauljava on 22/06/2018.
 */
public class SecondAutomationTest {

    @Test
    public void verifyLoadingAlertHandlingPage() {

        WebDriver driver = new SafariDriver();

        driver.navigate().to("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
        ToolsqaAlertHandlingPage toolsqaAlertHandlingPage = new ToolsqaAlertHandlingPage(driver);

        if (toolsqaAlertHandlingPage.isInitialized()){
            System.out.println("Page initialized correctly.");
        }

        driver.close();
        driver.quit();
    }

    @Test
    public void verifyHandlingSimpleAlert() {

        WebDriver driver = new SafariDriver();

        driver.navigate().to("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
        ToolsqaAlertHandlingPage toolsqaAlertHandlingPage = new ToolsqaAlertHandlingPage(driver);

        if (toolsqaAlertHandlingPage.isInitialized()){
            toolsqaAlertHandlingPage.clickSimpleAlertButton();
            toolsqaAlertHandlingPage.acceptSimpleAlert() ;
        }

        driver.close();
        driver.quit();
    }

}
