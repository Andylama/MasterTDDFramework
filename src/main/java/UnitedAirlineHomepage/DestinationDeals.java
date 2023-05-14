package UnitedAirlineHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static WebElements.UnitedElements.*;
public class DestinationDeals extends CommonAPI {
 /*  Access destination deals information
     when I am on the United Airlines homepage  */
    @FindBy(xpath=dealsOfferXpath ) public WebElement dealsOfferLocator;
    @FindBy(xpath=discountPakageXpath) public WebElement discountPakageLocator;
    public DestinationDeals (WebDriver driver) {PageFactory.initElements(driver,this);}
    public void openDealsPage(){dealsOfferLocator.click();}
    public void searchOnDiscount(){discountPakageLocator.click();}
    public void discount_deals_Offer(){
    openDealsPage(); searchOnDiscount();
    }
}
/* When I click on the Deals and Offers button
    And I click on the Discount Packages link
    Then I should be able to see destination deals information
   */