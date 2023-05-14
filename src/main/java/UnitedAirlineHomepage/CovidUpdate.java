package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static WebElements.UnitedElements.*;
public class CovidUpdate extends CommonAPI {
  /*  Access Covid update information
    when I am on the United Airlines homepage   */
    @FindBy(xpath=helpButtonXpath ) public WebElement helpButtonLocator;
    @FindBy(xpath=covidXpath ) public WebElement covidLocator;
    @FindBy(xpath=whatexpectXpath ) public WebElement whatexpectLocator;
    public CovidUpdate (WebDriver driver) { PageFactory.initElements(driver,this);}
    public void OpenhelpPage(){helpButtonLocator.click();}
    public void CovidPage(){covidLocator.click();}
    public void WhatexpectPage(){whatexpectLocator.click();}
    public void Open_Help_Page(){OpenhelpPage();CovidPage();WhatexpectPage();
    }
}

/*    When I click on the Help button
    And I click on the Covid link
    And I click on the What to expect link
    Then I should be able to see Covid update information   */