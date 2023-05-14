package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import static WebElements.UnitedElements.*;
public class CheckMyTrip extends CommonAPI {
    /*Verify my trip using confirmation number and last name
       Given I am on the United Airlines homepage*/
    @FindBy(xpath=clickOnMyTripXpath) public WebElement clickOnMyTripLocator;
    @FindBy(xpath=sendConfirmationNumXpath) public WebElement sendConfirmationNumLocator;
    @FindBy(xpath=putLastNameXpath) public WebElement putLastNameLocator;
    @FindBy(xpath=clickOnSubmitXpath) public WebElement clickOnSubmitLocator;
    public CheckMyTrip(WebDriver driver){PageFactory.initElements(driver,this);}
    public void clickMyTrip(){clickOnMyTripLocator.click();}
    public void confirmConfirmationNumber(String number){sendConfirmationNumLocator.sendKeys(number);}
    public void enterLastName(String name){putLastNameLocator.sendKeys(name);}
    public void clickOnSubmitButton(){clickOnSubmitLocator.submit();}
    public void click_On_My_Trip(){
   clickMyTrip();
   confirmConfirmationNumber("13456785");
   enterLastName("Lama");
   clickOnSubmitButton();
    }
}

/*  When I click on the My Trip button
    And I enter the confirmation number "13456785"
    And I enter the last name "Lama"
    And I click on the Submit button
    Then I should be able to see my trip details      */