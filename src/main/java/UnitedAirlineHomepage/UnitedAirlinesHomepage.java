package UnitedAirlineHomepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static WebElements.UnitedElements.UnitedFeedbackCss;

// Defining the public class that extends CommonAPI
public class UnitedAirlinesHomepage extends CommonAPI {

    // locate on the web element page UnitedFeedbackCss is the
    // CSS selector for the web elementfor test case 1//
    @FindBy(css = UnitedFeedbackCss)
    public WebElement UnitedFeedbacklocator;

    // Constructor for the UnitedAirlinesHomepage class
    // driver is passed as parmeter to initialize the pageFactory//
    public UnitedAirlinesHomepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Method to clicks on the 'UnitedFeedbacklocator ' web element and
    // pause 2 seconds for test case 1//
    public void ClickFeedback() throws InterruptedException {
        UnitedFeedbacklocator.click();
        Thread.sleep(2000);
    }

    // Method that calls ClickFeedback() method for test case 1//
    public void Click_Feedback_Button() throws InterruptedException {
        ClickFeedback();
    }
}
