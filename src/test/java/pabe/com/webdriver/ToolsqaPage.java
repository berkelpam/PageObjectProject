package pabe.com.webdriver;


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

    @FindBy(name="lastname")
    private WebElement lastNameField;

    @FindBy(id="sex-0")
    private WebElement sexMaleRadioButton;

    @FindBy(id="sex-1")
    private WebElement sexFeMaleRadioButton;

    @FindBy(id="exp-0")
    private WebElement yearsOfExperienceEqualsOne;

    @FindBy(id="exp-1")
    private WebElement yearsOfExperienceEqualsTwo;

    @FindBy(id="exp-2")
    private WebElement yearsOfExperienceEqualsThree;

    @FindBy(id="exp-3")
    private WebElement yearsOfExperienceEqualsFour;

    @FindBy(id="exp-4")
    private WebElement yearsOfExperienceEqualsFive;

    @FindBy(id="exp-5")
    private WebElement yearsOfExperienceEqualsSix;

    @FindBy(id="exp-6")
    private WebElement yearsOfExperienceEqualsSeven;

    @FindBy(id="datepicker")
    private WebElement birthDate;

    @FindBy(id="profession-0")
    private WebElement professionManualTester;

    @FindBy(id="profession-0")
    private WebElement professionAutomationTester;

    @FindBy(id="tool-0")
    private WebElement toolQTP;

    @FindBy(id="tool-1")
    private WebElement toolSelenium;

    @FindBy(id="tool-2")
    private WebElement toolSeleniumDriver;

    @FindBy(id="continents")
    private WebElement contintent;

    @FindBy(id="submit")
    private WebElement submitButton;

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

    public void setFirstName(String firstName) {
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

    public void enterFullCredentialsValidUserNetherlands(){

    }
}
