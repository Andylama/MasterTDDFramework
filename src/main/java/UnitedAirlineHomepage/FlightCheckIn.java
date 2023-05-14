package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static WebElements.UnitedElements.*;
public class FlightCheckIn extends CommonAPI {
    /* Verify flight check-in using confirmation number and last name
       when I am on the United Airlines homepage */
    @FindBy(xpath=clickOnCheckInXpath) public WebElement clickOnCheckInLocator;
    @FindBy(xpath=submitConfirmationNumberXpath) public WebElement submitConfirmationNumberLocator;
    @FindBy(xpath=enterLastNameXpath) public WebElement enterLastNameLocator;
    @FindBy(xpath=clickSearchXpath) public WebElement clickSearchLocator;
    public FlightCheckIn(WebDriver driver){PageFactory.initElements(driver,this);}
    public void clickCheckIn(){clickOnCheckInLocator.click();}
    public void submitNumber(String number){submitConfirmationNumberLocator.sendKeys(number);}
    public void enterTheLastName(String name){enterLastNameLocator.sendKeys(name);}
    public void clickSearchButton(){clickSearchLocator.click();}
    public void click_On_Check_In(){
    clickCheckIn();
    submitNumber("145678848");
    enterTheLastName("Andy");
    clickSearchButton();
    }
}
/*  When I click on the Check-In button
    And I enter the confirmation number "145678848"
    And I enter the last name "Andy"
    And I click on the Search button
    Then I should be able to see my flight check-in information  */
