package United;
import UnitedAirlineHomepage.PromotionUpdate;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestPromotionUpdate extends CommonAPI {
  /* Subscribe to promotional emails when I am on the United Airlines homepage */
    @Test(description = "Promotioanl E-mail")
    public void Test_Promotional_Email(){
    PromotionUpdate promotionUpdate = new PromotionUpdate(getDriver());
    promotionUpdate.promotional_Emails();
    }
}