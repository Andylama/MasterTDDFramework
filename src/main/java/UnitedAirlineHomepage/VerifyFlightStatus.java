package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static WebElements.UnitedElements.*;
/*  Verify flight status using flight information when I am on the United Airlines homepage */
public class VerifyFlightStatus extends CommonAPI {
    @FindBy(xpath =clickOnFlightStatusXpath) public WebElement clickOnFlightStatusLocator;
    @FindBy(xpath=departFromXpath) public WebElement departFromLocator;
    @FindBy(xpath=destinationXpath) public WebElement destinationLocator;
    @FindBy(xpath=flightNumberXpath) public WebElement flightNumberLocator;
    @FindBy(xpath=enterDateXpath) public WebElement enterDateLocator;
    @FindBy(xpath=submitButtonXpath) public WebElement submitButtonLocator;
    public VerifyFlightStatus(WebDriver driver){PageFactory.initElements(driver,this);}
    public void checkFlightStatus(){clickOnFlightStatusLocator.click();}
    public void departLocation(String location){departFromLocator.sendKeys(location);}
    public void destinationLocation(String destination){destinationLocator.sendKeys(destination);}
    public void flightNumber(String number){flightNumberLocator.sendKeys(number);}
    public void selectDate(String date){enterDateLocator.sendKeys(date);}
    public void clickOnSubmitButton(){submitButtonLocator.submit();}
    public void check_Flight_Status(){
        checkFlightStatus();
        departLocation("New York LGA");
        destinationLocation("Boston BNH");
        flightNumber("23456789");
        selectDate("Apr 5, 2023");
        clickOnSubmitButton();
    }
}
/* When I click on the flight status button
And I enter the departure location as "New York LGA"
And I enter the destination as "Boston BNH"
And I enter the flight number as "23456789"
And I select the date as "Apr 5, 2023"
And I click on the submit button
Then the flight status should be displayed successfully   */
