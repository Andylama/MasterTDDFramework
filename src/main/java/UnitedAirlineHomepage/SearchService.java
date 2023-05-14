//selecting the "WiFi" service on United Airlines' webpage //
package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static WebElements.UnitedElements.*;
public class SearchService extends CommonAPI {
 /* Select WiFi service when I am on the United Airlines homepage  */
    @FindBy(xpath = clickOnSearchXpath) public WebElement clickOnSearchLocator;
    @FindBy(xpath = searchServiceXpath) public WebElement searchServiceLocator;
    @FindBy(xpath=clickOnSearchForXpath) public WebElement clickOnSearchForLocator;
    public SearchService(WebDriver driver) {PageFactory.initElements(driver, this);}
    public void clickOnSearchButton(){clickOnSearchLocator.click();}
    public void clickOnSearchMenu(){clickOnSearchForLocator.click();}
    public void selectService(String service){searchServiceLocator.sendKeys(service);}
    public void submitForSearchResult(){searchServiceLocator.submit();}
    public void click_On_Search(){clickOnSearchButton();}
    public void select_Service(){
    clickOnSearchMenu();
    selectService("WiFi");
    submitForSearchResult();
    }
}
/* When I click on the Search button
    And I select the Search for menu
    And I enter "WiFi" in the search field
    And I submit the search
    Then I should see results related to WiFi service    */








