package United;
import UnitedAirlineHomepage.CheckMyTrip;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestCheckMyTrip extends CommonAPI {
 /*Verify my trip using confirmation number and last name when I am on the United Airlines homepage*/
    @Test(description ="Trip chekup" )
    public void Test_CheckUp_MyTrip(){
     CheckMyTrip checkMyTrip = new CheckMyTrip(getDriver());
     checkMyTrip.click_On_My_Trip();
    }
}