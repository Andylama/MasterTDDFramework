package Geico;

import GeicoHomepage.GeicoHomepage;
import base.CommonAPI;
import org.testng.annotations.Test;
public class TestGeicoHomePage extends CommonAPI {



    @Test
    public void TesthGeicoLogo(){
        GeicoHomepage geicoHomepage = new GeicoHomepage(getDriver());
        geicoHomepage.verifyGeicologoPage();


    }
}
