package pabe.com.webdriver;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by pauljava on 22/06/2018.
 */
public class RabobankTest {


    @Test
    public void initializePage(){

        WebDriver driver = new SafariDriver();

        System.out.println(driver.getTitle());

        RabobankHomePage homePage = new RabobankHomePage(driver);

        if (homePage.isInitialized()){
            System.out.println("Initialized Home Page");
        }

        driver.close();
        driver.quit();

    }

    @Test
    public void setCookieRabobank(){

        WebDriver driver = new SafariDriver();

        ((JavascriptExecutor) driver).executeScript("var myDate = new Date(); \n" +
                "myDate.setMonth(myDate.getMonth() + 12); \"RABO_PSL=3;expires=\" + myDate + \";domain=.rabobank.nl;path=/\";");


        RabobankHomePage homePage = new RabobankHomePage(driver);

        homePage.clickSearchBox();
//        homePage.clickOverstapService();

        System.out.println(driver.getTitle());

        RabobankOverstappenPage rabobankOverstappenPage = new RabobankOverstappenPage(driver);

        RabobankZeZaPage zezaPage = new RabobankZeZaPage(driver);

        System.out.println(driver.getTitle());

        assert (driver.getTitle().equals("ZekerVanJeZaak, het verzekeringspakket voor ondernemers - Rabobank"));

        driver.close();
        driver.quit();

    }
}
