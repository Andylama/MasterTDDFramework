//"Accessing Travel information" and "Route maps" of the United Airlines homepage //
package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static WebElements.UnitedElements.*;

/* Access Travel Information and Route Maps
    when I am on the United Airlines homepage  */
public class TravelInfo extends CommonAPI {
    // locate on the web element page for TravelInfo class
    @FindBy(xpath=travelInfoXpath) public WebElement travelInfoLocator;
    @FindBy(xpath=onBoardServiceXpath) public WebElement onBoardServiceLocator;
    // Constructor for the TravelInfo class
    public TravelInfo (WebDriver driver){PageFactory.initElements(driver,this);}
    // Method to clicks on the 'TravelInfo' class web elements
    public void infoCenter(){travelInfoLocator.click();}
    public void mapGuidance(){onBoardServiceLocator.click();}
    // Method that calls TravelInfo class for test case
    public void display_route_info(){
    infoCenter();
    mapGuidance();
    }
}
/*   When I click on the Travel Information button
    And I select the Route Maps option
    Then I should be redirected to the Route Maps page    */