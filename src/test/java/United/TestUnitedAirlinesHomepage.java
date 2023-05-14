package United;
import UnitedAirlineHomepage.UnitedAirlinesHomepage;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestUnitedAirlinesHomepage extends CommonAPI {
 /* Provide feedback using the feedback form when I am on the United Airlines homepage */
    @Test(description = "Feedback Button")
    public void Test_United_Feedback() {
/* Defining a TestNG test method named "TestunitedFeedback"*/
 UnitedAirlinesHomepage unitedAirlinesHomepage = new UnitedAirlinesHomepage(getDriver());
    /*Creating an instance of the "UnitedAirlinesHomepage" class
         and passing the driver instance to its constructor*/
 unitedAirlinesHomepage.Click_Feedback_Button();
 /* Calling the "Click_Feedback_Button()" method of the "UnitedAirlinesHomepage" class instance*/
    }
}
