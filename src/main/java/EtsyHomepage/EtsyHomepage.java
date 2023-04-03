package EtsyHomepage;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static WebElements.EtsyElements.EtsysearchBarXpath;
import static WebElements.EtsyElements.EtsysearchjeweleryXpath;

public class EtsyHomepage extends CommonAPI {

    public EtsyHomepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


// Declaring the EtsyHomepage class, which extends the CommonAPI class.//


// Constructor for the EtsyHomepage class, which initializes PageFactory for the WebDriver.


// Declaring WebElements for the Etsy search bar and the jewelry search button.
    @FindBy(xpath = EtsysearchBarXpath) public WebElement Etsyserchbar;
    @FindBy(xpath = EtsysearchjeweleryXpath) public WebElement JeweleyLocator;

// Method to enter the product name in the search bar and submit the search for test case 1.
    public void enterProductNameonSearchBar(String productName) {
        Etsyserchbar.sendKeys(productName);
    }
    public void submitForSearchResult() throws InterruptedException {
        Etsyserchbar.submit();

        System.out.println(" This is a waiting Time");

    }

// Method to click the jewelry search button for test case----------------------- 2//
    public void clickonjeweleryButton(){JeweleyLocator.click();}

// Method to search for a product in the Etsy search bar for test case----------------- 1 //
    public void searching_a_Product_in_EtsySearchBar() throws InterruptedException {
        enterProductNameonSearchBar("Toys");
        submitForSearchResult();
    }


// Method to search for jewelry using the search button for test case--------------------- 2//
    public void seaching_jewelery_product(){
        clickonjeweleryButton();
    }

}

