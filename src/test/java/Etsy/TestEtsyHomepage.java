package Etsy;

import EtsyHomepage.EtsyHomepage;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestEtsyHomepage extends CommonAPI {
    EtsyHomepage etsyHomepage= new EtsyHomepage(getDriver());
  @Test(enabled = false)

    public void testEtsyProduct() throws InterruptedException {

      EtsyHomepage etsyHomepage= new EtsyHomepage(getDriver());
      etsyHomepage.searching_a_Product_in_EtsySearchBar();
    }

    @Test(enabled = false)
    public void testjeweleryProduct() {

      EtsyHomepage etsyHomepage= new EtsyHomepage(getDriver());
      etsyHomepage.clickonjeweleryButton();
    }



    }



