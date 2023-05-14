package United;
import UnitedAirlineHomepage.TravelInfo;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestTravelInfo extends CommonAPI {
 /* Access Travel Information and Route Maps when I am on the United Airlines homepage  */
 @Test(description = "Display Route Center")
 public void Test_Display_Route_Center(){
  TravelInfo travelInfo = new TravelInfo(getDriver());
  travelInfo.display_route_info();
 }
}


