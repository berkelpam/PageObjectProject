package pabe.com.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by Paul van Berkel on 21-06-18
 */
public class FirstAutomationTest {

    @Test
    public void verifyDutchUser(){

        WebDriver driver = new SafariDriver();

        driver.navigate().to("http://toolsqa.com/automation-practice-form/");
        ToolsqaPage toolsPage = new ToolsqaPage(driver);
        toolsPage.enterFullCredentialsValidUserNetherlands();
        toolsPage.submitForm();

        driver.close();
        driver.quit();
    }

    @Test
    public void verifiyAsianUser(){

        WebDriver driver = new SafariDriver();

        driver.navigate().to("http://toolsqa.com/automation-practice-form/");
        ToolsqaPage toolsPage = new ToolsqaPage(driver);
        toolsPage.enterFullCredentialsValidUserAsia();
        toolsPage.submitForm();

        driver.close();
        driver.quit();
    }
}