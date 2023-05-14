package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static WebElements.UnitedElements.*;
public class ChangeLanguage extends CommonAPI {
 /*Change language to the desired one Given I am on the United Airlines homepage*/
    @FindBy(xpath = clickLanguageButtonXpath)
    public WebElement clickLanguageLocator;
    @FindBy(xpath = languageDropDownXpath)
    public WebElement languageDropDownLocator;
    @FindBy(xpath = clickOnLanguageXpath)
    public List<WebElement> clickOnLanguageLocator;
    @FindBy(xpath = clickOnChangeButtonXpath)
    public WebElement clickOnChangeButtonLocator;
    public ChangeLanguage(WebDriver driver) {
     PageFactory.initElements(driver, this);    }
    public void clickOnLanguageButton() {
     click(clickLanguageLocator);       }
    public void clickOnLanguageDropDown() {
    click(languageDropDownLocator);       }
    public void selectLanguage(String language) {
        for (WebElement element : clickOnLanguageLocator) {
            if (element.getText().equals(language)) {
                click(element);
            }
        }
    }
    public void clickOnChangeButton()      {
     click(clickOnChangeButtonLocator);     }
    public String getLanguage() throws InterruptedException {
    Thread.sleep(2000);
    return clickLanguageLocator.getText();
    }
    public void changeLanguage(String language) {
    clickOnLanguageButton();
    clickOnLanguageDropDown();
    selectLanguage(language);
    clickOnChangeButton();
    }
}
/* When I click on the language button
    And I click on the language dropdown
    And I select the language "French"
    And I click on the Change button
    Then the language should be changed to "French"     */