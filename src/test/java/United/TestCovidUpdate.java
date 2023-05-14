package United;
import UnitedAirlineHomepage.CovidUpdate;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestCovidUpdate extends CommonAPI {
 /*  Access Covid update information  when I am on the United Airlines homepage   */
    @Test(description = "Passenger Covid Information")
    public void Test_Covid_Information() throws InterruptedException {
    CovidUpdate covidUpdate = new CovidUpdate(getDriver());
    covidUpdate.Open_Help_Page();
    Thread.sleep(2000);
    }
}