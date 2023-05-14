package United;
import UnitedAirlineHomepage.LogIn;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestLogIn extends CommonAPI {
 /*  Verify successful log in to United Airlines when I am on the United Airlines homepage  */
    @Test(description =" Passenger Login")
    public void Test_ClickOn_SignIn() {
        LogIn logIn = new LogIn(getDriver());
        logIn.click_In_United_Log_In_Button("2345677","lama");
        String expected = "Please enter a valid MileagePlus number.";
        String actual = logIn.displayedText();
        Assert.assertNotEquals(expected,actual);
    }
}

