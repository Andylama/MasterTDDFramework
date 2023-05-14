package United;
import UnitedAirlineHomepage.VerifyFlightStatus;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestFlightStatus extends CommonAPI {
 /*  Verify flight status using flight information when I am on the United Airlines homepage */
    @Test(description = "Flight Status")
    public void Test_FlightStatus_Information(){
        VerifyFlightStatus verifyFlightStatus = new VerifyFlightStatus(getDriver());
        verifyFlightStatus.check_Flight_Status();
    }
}