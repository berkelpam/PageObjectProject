package pabe.com.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

//Info: When you write your code IntelliJ automatically adds required classes
//Also you can select and add required classes by pressing ALT+Enter then select related class

/**
 * Created by ONUR BASKIRT on 26.08.2015.
 */
public class FirstAutomationTest {

    //    //We should add @Test annotation that JUnit will run below method
//    @Test
//    //Start to write our test method. It should ends with "Test"
//    public void firefoxTest(){
//
//        //Step 1- Driver Instantiation: Instantiate driver object as FirefoxDriver
//        WebDriver driver = new FirefoxDriver();
//
//        //Step 2- Navigation: Open a website
//        driver.navigate().to("https://www.teknosa.com/");
//
//        //Step 3- Assertion: Check its title is correct
//        //assertEquals method Parameters: Message, Expected Value, Actual Value
//        Assert.assertEquals("Title check failed!", "Teknosa Alışveriş Sitesi - Herkes İçin Teknoloji", driver.getTitle());
//
//        //Step 4- Close Driver
//        driver.close();
//
//        //Step 5- Quit Driver
//        driver.quit();
//    }
    @Test
    //Start to write our test method. It should ends with "Test"
    public void setUp() {

        //Step 1- Driver Instantiation: Instantiate driver object as FirefoxDriver
        WebDriver driver = new SafariDriver();

        //Step 2- Navigation: Open a website
        driver.navigate().to("https://www.google.com");
//
//        HomePage objHomePage = new HomePage(driver);
//
//        assert (objHomePage.isInitialized());
//
//        objHomePage.searchWebsite("CSS");
//
//        CookiesPage cookieWall = new CookiesPage(driver);
//
////        cookieWall.isInitalized();
//        cookieWall.acceptCookies();
//
//        SearchPage objSearchPage=new SearchPage(driver);
//
//        assert (objSearchPage.isInitialized());
//
//        objHomePage.clickBeleggen();
//
//
//
//        CookiesPage objCookiesPage = new CookiesPage(driver);
//
//        assert (objCookiesPage.isInitalized());

//        objCookiesPage.acceptCookies();


        GoogleSearchPage googlePage = new GoogleSearchPage(driver);

        googlePage.searchFor("java for beginners");

        GoogleResultPage googleResultsPage = new GoogleResultPage(driver);

        if (googleResultsPage.isInitialized()) {
            System.out.println("ResultForm is displayed, so SearchPage is Initialized.");

            //verify results displayed




//            if (googleResultsPage.returnedResults()) {
//                System.out.println("Results returned");
//                System.out.println(googleResultsPage.getResultStatsText());
//            }
        }

        //Test the toolsqa test site.

        driver.navigate().to("http://toolsqa.com/automation-practice-form/");

        ToolsqaPage toolsPage = new ToolsqaPage(driver);

        if (toolsPage.isInitialized()){
            System.out.println("initialization complete..or not..");
            if (toolsPage.elementsPresent()){
                System.out.println("elements present");
            }
        }


    }


    //Step 4- Close Driver
//        driver.close();
//
//    //Step 5- Quit Driver
//        driver.quit();
//}


}