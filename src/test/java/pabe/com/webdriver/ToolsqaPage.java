package pabe.com.webdriver;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pauljava on 21/06/2018.
 */
public class ToolsqaPage extends PageObject {
    public ToolsqaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id="page")
    private WebElement page;

    @FindBy (partialLinkText = "Partial Link")
    private WebElement partialLink;

    @FindBy (name="firstname")
    private WebElement firstNameField;


    public boolean isInitialized(){

        if (page.isDisplayed()) {
            System.out.println("Tools QA Page is Initalized.");
        }
        else{
            System.out.println("Tools QA Page is not initialized.");
        }

        return page.isDisplayed();
    }

    public boolean elementsPresent(){
        if (this.partialLink.isDisplayed()){
            return true;
        }
        return false;
    }




    @Test
    public void name() throws Exception {

    }


}
