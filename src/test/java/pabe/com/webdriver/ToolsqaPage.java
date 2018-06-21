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

    @FindBy(id = "page")
    private WebElement page;

    @FindBy(partialLinkText = "Partial Link")
    private WebElement partialLink;

    @FindBy(name = "firstname")
    private WebElement firstNameField;


    public boolean isInitialized() {

        if (page.isDisplayed()) {
            System.out.println("Tools QA Page is Initalized.");
        } else {
            System.out.println("Tools QA Page is not initialized.");
        }

        return page.isDisplayed();
    }

    public boolean elementsPresent() {
        if (this.partialLink.isDisplayed() && this.firstNameField.isDisplayed()) {
            return true;
        }
        return false;
    }

    public void setFirstNameField(WebElement firstNameField) {
        this.firstNameField = firstNameField;
    }

    public void setFirstName(String firstName){
        this.firstNameField.sendKeys(firstName);
    }

    public String getFirstName() {

        String textValue;

        if (firstNameField.getText().length() > 0) {
            textValue = firstNameField.getText();
        } else {
            textValue = "Value not filled in.";
        }
        return textValue;


    }


    @Test
    public void name() throws Exception {

    }


}
