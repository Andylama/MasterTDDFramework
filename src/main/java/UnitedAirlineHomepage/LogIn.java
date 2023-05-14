package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static WebElements.UnitedElements.*;
public class LogIn extends CommonAPI {
/*  Verify successful log in to United Airlines
    when I am on the United Airlines homepage  */
    @FindBy(xpath= unitedLogInButtonXPATH) public WebElement unitedLogInButtonLocator;
    @FindBy(css = unitedInputFieldCSS) public WebElement unitedInputFieldLocator;
    @FindBy(name = unitedPasswordNAME) public WebElement  unitedPasswordFieldLocator;
    @FindBy(xpath = loginPasswordXpath) public  WebElement logInPasswordLocator;
    @FindBy(xpath = enterValidNumberXpath) public  WebElement enterValidNumberLocator;
    public LogIn(WebDriver driver) {PageFactory.initElements(driver, this);}
    public void click_In_United_Log_In_Button(String number,String pass){
        //   WebDriver driver = new WebDriver;
        //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    unitedLogInButtonLocator.click();
    unitedInputFieldLocator.sendKeys(number);
    unitedPasswordFieldLocator.sendKeys(pass);
    logInPasswordLocator.click();
    }
    public String displayedText(){
    return enterValidNumberLocator.getText();
    }
}

/* When I click on the United Log-In button
    And I enter my username "myusername"
    And I enter my password "mypassword"
    And I click on the Login button
    Then I should be logged in successfully   */