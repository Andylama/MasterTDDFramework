package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static WebElements.UnitedElements.*;
public class MileagePlusProgram extends CommonAPI {
 /* Verify the business credit card option in Mileage Plus Program
      when I am on the United Airlines homepage */
    @FindBy(xpath=clickOnMileagePlusXpath) public WebElement clickOnMileagePlusLocator;
    @FindBy(xpath=selectBusinessCreditCardXpath) public WebElement selectBusinessCreditCardLocator;
    public MileagePlusProgram (WebDriver driver){PageFactory.initElements(driver,this);}
    public void clickOnMileagePlus(){clickOnMileagePlusLocator.click();}
    public void selectBusinessCreditCard(){selectBusinessCreditCardLocator.click();}
    public void mileage_Plus_Program(){
    clickOnMileagePlus(); selectBusinessCreditCard();
    }
}
/* When I click on the Mileage Plus button
    And I select the Business Credit Card option
    Then I should see information about the Business Credit Card option in the Mileage Plus Program

   */