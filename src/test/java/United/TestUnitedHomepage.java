package United;
import UnitedAirlineHomepage.UnitedAirlinesHomepage;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestUnitedHomepage extends CommonAPI {

    // Defining a TestNG test method named "TestunitedFeedback"
    @Test()
    public void TestunitedFeedback() throws InterruptedException {

        // Creating an instance of the "UnitedAirlinesHomepage" class
        // and passing the driver instance to its constructor//
        UnitedAirlinesHomepage unitedAirlinesHomepage = new UnitedAirlinesHomepage(getDriver());

        // Calling the "Click_Feedback_Button()" method of the "UnitedAirlinesHomepage" class instance//
        unitedAirlinesHomepage.Click_Feedback_Button();

    }
}


