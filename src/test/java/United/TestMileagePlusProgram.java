package United;
import UnitedAirlineHomepage.MileagePlusProgram;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestMileagePlusProgram extends CommonAPI {
 /* Verify the business credit card option in Mileage Plus Program
    when I am on the United Airlines homepage */
    @Test(description = " Mileage Plus Program")
    public void Test_Discover_Mileage_Plus_Program(){
    MileagePlusProgram mileagePlusProgram = new MileagePlusProgram(getDriver());
    mileagePlusProgram.mileage_Plus_Program();
    }
}