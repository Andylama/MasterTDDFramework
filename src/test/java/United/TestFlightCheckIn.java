package United;
import UnitedAirlineHomepage.FlightCheckIn;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestFlightCheckIn extends CommonAPI {
 /* Verify flight check-in using confirmation number and last name when I am on the United Airlines homepage */
    @Test(description = "Complete Flight CheckIn")
    public void Test_Complete_CheckIn(){
        FlightCheckIn flightCheckIn = new FlightCheckIn(getDriver());
        flightCheckIn.click_On_Check_In();
    }
}