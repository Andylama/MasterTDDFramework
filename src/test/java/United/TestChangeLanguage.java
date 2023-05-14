package United;
import UnitedAirlineHomepage.ChangeLanguage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestChangeLanguage extends CommonAPI {
    /*Change language to the desired one when I am on the United Airlines homepage*/

    @Test(description = " Language Selection")
    public void Test_Change_Language() throws InterruptedException {
        ChangeLanguage changeLanguage = new ChangeLanguage(getDriver());
        String language = "Deutsch";
        changeLanguage.changeLanguage(language);
        Assert.assertTrue(changeLanguage.getLanguage().contains(language));
    }
}