package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static WebElements.UnitedElements.*;
public class PromotionUpdate extends CommonAPI {
  /* Subscribe to promotional emails
    when I am on the United Airlines homepage   */
    @FindBy (xpath=emailXpath) public WebElement emailLocator;
    @FindBy (xpath=firstNameXpath) public WebElement firstNameLocator;
    @FindBy (xpath=lastNameXpath) public WebElement lastNameLocator;
    @FindBy  (xpath=subscribeXpath) public WebElement subscribeLocator;
    public PromotionUpdate(WebDriver driver){PageFactory.initElements(driver,this);}
    public void enterEmail(String email){emailLocator.sendKeys(email);}
    public void enterFirstName(String fname){firstNameLocator.sendKeys(fname);}
    public void enterLastName(String lname){lastNameLocator.sendKeys(lname);}
    public void clickOnSubscribe(){subscribeLocator.click();}
    public void promotional_Emails(){
    enterEmail("Andy2000@gmail.com");
    enterFirstName("Andy");
    enterLastName("Lama");
    clickOnSubscribe();
    }
}
/*  When I enter my email "Andy2000@gmail.com"
    And I enter my first name "Andy"
    And I enter my last name "Lama"
    And I click on the Subscribe button
    Then I should receive promotional emails from United Airlines
   */