package pabe.com.webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
    Select continentList= new Select(contintent);

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

    public void clearFieldValues(){
        this.firstNameField.clear();
        this.lastNameField.clear();
        this.sexFeMaleRadioButton.clear();
        this.sexMaleRadioButton.clear();
        this.yearsOfExperienceEqualsOne.clear();
        this.yearsOfExperienceEqualsTwo.clear();
        this.yearsOfExperienceEqualsThree.clear();
        this.yearsOfExperienceEqualsFour.clear();
        this.yearsOfExperienceEqualsFive.clear();
        this.yearsOfExperienceEqualsSix.clear();
        this.yearsOfExperienceEqualsSeven.clear();
        this.birthDate.clear();
        this.professionAutomationTester.clear();
        this.professionManualTester.clear();
        this.toolQTP.clear();
        this.toolSelenium.clear();
        this.toolSeleniumDriver.clear();
        this.contintent.clear();
    }

    public void enterFullCredentialsValidUserNetherlands(){

        clearFieldValues();

        this.firstNameField.sendKeys("Jan");
        this.lastNameField.sendKeys("Janssen");
        this.sexMaleRadioButton.click();
        this.yearsOfExperienceEqualsFive.click();
        this.birthDate.sendKeys("11-11-1911");
        this.professionAutomationTester.click();
        this.continentList.selectByVisibleText("Europe");
        this.toolQTP.click();

    }

    public void enterFullCredentialsValidUserAsia(){

        clearFieldValues();

        this.firstNameField.sendKeys("田中太郎");
        this.lastNameField.sendKeys("東海林賢蔵");
        this.sexMaleRadioButton.click();
        this.yearsOfExperienceEqualsFive.click();
        this.birthDate.sendKeys("09-14-1987");
        this.professionAutomationTester.click();
        this.continentList.selectByVisibleText("Asia");
        this.toolQTP.click();

    }

    public void submitForm(){
        this.submitButton.click();
    }

    private void verifyElements(){

    }
}
