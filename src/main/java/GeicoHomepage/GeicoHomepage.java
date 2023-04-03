package GeicoHomepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static WebElements.GeicoElements.GeicoLogoCss;

public class GeicoHomepage extends CommonAPI {

    public GeicoHomepage(WebDriver driver) {
       PageFactory.initElements(driver, this);
    }

    // getting webelments ready for test case-1--------------------------------------------//
    @FindBy(css = GeicoLogoCss)
    public WebElement GeicoLogolocator;

    // creaing method for our test cases-1-------------------------------------------------//
    public void verifyGeicologoPage() { GeicoLogolocator.isDisplayed();}

}