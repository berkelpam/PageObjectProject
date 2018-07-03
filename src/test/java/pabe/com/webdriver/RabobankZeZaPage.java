package pabe.com.webdriver;

import org.openqa.selenium.WebDriver;

/**
 * Created by pauljava on 03/07/2018.
 */
public class RabobankZeZaPage extends PageObject {
    public RabobankZeZaPage(WebDriver driver) {
        super(driver);
        driver.navigate().to("https://www.rabobank.nl/bedrijven/verzekeringen/interpolis-zekervanjezaak/");
//        waitForClassNameVisible("homepage");

        assert (driver.getTitle().equals("ZekerVanJeZaak, het verzekeringspakket voor ondernemers - Rabobank")) == true;

    }
}