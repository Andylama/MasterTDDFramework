package United;
import UnitedAirlineHomepage.DestinationDeals;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestDestinationDeals extends CommonAPI {
/*  Access destination deals information when I am on the United Airlines homepage  */
    @Test(description = "Deals of Destination")
    public void Test_Deals_of_Destination() throws InterruptedException {
    DestinationDeals destinationDeals = new DestinationDeals(getDriver());
    destinationDeals.discount_deals_Offer();
    Thread.sleep(2000);
    }
}