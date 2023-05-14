package United;
import UnitedAirlineHomepage.SearchService;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestSearchService extends CommonAPI {
 /* Select WiFi service when I am on the United Airlines homepage  */
    @Test(description = "Finding Services")
    public void Test_Find_Service(){
    SearchService searchService = new SearchService(getDriver());
    searchService.click_On_Search();
    searchService.select_Service();
    }
}
