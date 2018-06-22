package pabe.com.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by Paul van Berkel on 21-06-18
 */


public class FirstAutomationTest {

    private static String PAGETITLE = "Demo Form for practicing Selenium Automation";

    @Test
    public void verifyCorrectPage() {

        WebDriver driver = new SafariDriver();

        driver.navigate().to("http://toolsqa.com/automation-practice-form/");
//        System.out.println(driver.getTitle());

        assert (driver.getTitle().equals(PAGETITLE));

        driver.close();
        driver.quit();
    }


    @Test
    public void verifyDutchUser() {

        WebDriver driver = new SafariDriver();

        driver.navigate().to("http://toolsqa.com/automation-practice-form/");
//        System.out.println(driver.getTitle());

        assert (driver.getTitle().equals("Demo Form for practicing Selenium Automation"));

        ToolsqaPage toolsPage = new ToolsqaPage(driver);

        if (toolsPage.isInitialized()) {

            toolsPage.enterFullCredentialsValidUserNetherlands();
            toolsPage.submitForm();
        }
        driver.close();
        driver.quit();
    }

    @Test
    public void verifiyAsianUser() {

        WebDriver driver = new SafariDriver();

        driver.navigate().to("http://toolsqa.com/automation-practice-form/");
        ToolsqaPage toolsPage = new ToolsqaPage(driver);

        if (toolsPage.isInitialized()) {
            toolsPage.enterFullCredentialsValidUserAsia();
            toolsPage.submitForm();
        }
        driver.close();
        driver.quit();
    }

    @Test
    public void verifiyAustralianUser() {

        WebDriver driver = new SafariDriver();

        driver.navigate().to("http://toolsqa.com/automation-practice-form/");
        ToolsqaPage toolsPage = new ToolsqaPage(driver);

        if (toolsPage.isInitialized()) {
            toolsPage.enterFullCredentialsValidUserAustralia();
            toolsPage.submitForm();
        }

        driver.close();
        driver.quit();
    }
}

