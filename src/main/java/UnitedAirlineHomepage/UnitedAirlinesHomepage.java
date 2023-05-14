// Providing the Feedback to the United Arilines website//
package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static WebElements.UnitedElements.*;
/* Provide feedback using the feedback form
when I am on the United Airlines homepage */
public class UnitedAirlinesHomepage extends CommonAPI {
    // locate on the web element page UnitedFeedbackCss is the
    // CSS selector for the web elementfor test case 1//
    @FindBy(css = UnitedFeedbackCss) public WebElement UnitedFeedbacklocator;
    @FindBy(xpath = esatisfytabXpath)  public WebElement esatisfytabLocator;
    @FindBy(xpath = chooseOptionXpath)  public WebElement chooseOptionLocator;
    @FindBy(xpath = clicksubmitbuttonXpath)  public WebElement clicksubmitbuttonLocator;
    // Constructor for the UnitedAirlinesHomepage class
    // driver is passed as parmeter to initialize the pageFactory//
    public UnitedAirlinesHomepage(WebDriver driver) {
    PageFactory.initElements(driver, this); }
    // Method to clicks on the 'UnitedFeedbacklocator ' web element and
    // pause 2 seconds for test case 1//
    public void ClickFeedback(){UnitedFeedbacklocator.click();}
    public  void clickonEsatify (){esatisfytabLocator.click();}
    public  void clickonYesButton (){chooseOptionLocator.click();}
    public  void clickonSubmitButton (){clicksubmitbuttonLocator.click();}
    // Method that calls ClickFeedback() method for test case 1//
    public void Click_Feedback_Button() {
    ClickFeedback();
    clickonEsatify();
    clickonYesButton();
    clickonSubmitButton();
 }
}
/*  When I click on the feedback button
And I select the e-satisfy tab
And I select "Yes"
And I click on the submit button
Then the feedback should be submitted successfully
   */