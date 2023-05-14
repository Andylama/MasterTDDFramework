package WebElements;
public class UnitedElements {
 //1st test case UnitedAirlinesHomepage----
    public static final String UnitedFeedbackCss="#QSIFeedbackButton-btn" ;
    public static final String esatisfytabXpath ="//table//span[contains(text(),'Extremely satisfied')]";
    public static final String chooseOptionXpath ="//label[@id='QID2-2-label']";
    public static final String clicksubmitbuttonXpath =" //input[@id='NextButton'] ";
 //2nd test case SearchService---------------------------------------------------
    public static final String clickOnSearchXpath =" //span[contains(text(),'Search')] ";
    public static final String clickOnSearchForXpath ="//*[@id=\"coveo-search-MainWebsiteSearch-input\"]";
    public static final String searchServiceXpath ="//button[@aria-label='WiFi, opens in a new tab.']";
 //3rd test case DestinationDeals------------------------------------------------
    public static final String dealsOfferXpath="//span[normalize-space()='DEALS']";
    public static final String discountPakageXpath="//span[normalize-space()='Discounts for 18 to 23 year olds']";
 //4th test case TravelInfo-----------------------------------------------------
    public static final String travelInfoXpath="//span[normalize-space()='TRAVEL INFO']";
    public static final String onBoardServiceXpath="//span[normalize-space()='Onboard services']";

 //5th test case Covid Info------------------------------------------------
    public static final String helpButtonXpath = "//span[normalize-space()='Help']";
    public static final String covidXpath = "//span[normalize-space()='COVID-19']";
    public static final String whatexpectXpath = "//div[@id='tabPanel-COVID-19']//strong[contains(text(),'What to expect')] ";

 //6th test case promotion update---------------------------------------------
    public static final String emailXpath="//input[@id='emailAddress-1680723759148']";
    public static final String firstNameXpath="//input[@id='firstName']";
    public static final String lastNameXpath="//input[@id='lastName']";
    public static final String subscribeXpath="//button[@type='submit']";

 //7th test case language change-------------------------------------------------
    public static final String clickLanguageButtonXpath="//nav//button[starts-with(@aria-label,'Currently')]";
    public static final String languageDropDownXpath="//button[@id='localization-language-selector']";
    public static final String clickOnLanguageXpath="//ul[@aria-labelledby='localization-language-selector_label-0']//li";
    public static final String clickOnChangeButtonXpath="//*[@id=\"localization-content-wrapper\"]/div[3]/button";

 // 8th test case Flight CheckIn-------------------------------------------------
    public static final String clickOnCheckInXpath="//div[normalize-space()='Check-in']";
    public static final String submitConfirmationNumberXpath="//input[@id='flightCheckInConfNumber']";
    public static final String enterLastNameXpath="//input[@id='flightCheckInLastName']";
    public static final String clickSearchXpath="//button[@id='formSubmitBtn']";

// 9th test case Check My Trip------------------------------------------------
    public static final String clickOnMyTripXpath="//div[contains(text(),'My trips')]";
    public static final String sendConfirmationNumXpath="//input[@id='myTripsConfirmationNumber']";
    public static final String putLastNameXpath="//input[@id='myTripsLastName']";
    public static final String clickOnSubmitXpath="//button[@id='myTripsSubmitBtn']";

 //10th test case Verify Flight Status --------------------------------------
    public static final String clickOnFlightStatusXpath="//li[@id='statusTab']//h2";
    public static final String departFromXpath="//input[@id='flightStatusOriginInput']";
    public static final String destinationXpath="//input[@id='flightStatusDestinationInput']";
    public static final String flightNumberXpath="//input[@id='flightStatusModel.flightNumber']";
    public static final String enterDateXpath="//button[@id='datesDropdown']";
    public static final String submitButtonXpath="//button[@aria-label='Search']";

// 11th test case for Sign In  -----------------------------------
    public static final String unitedLogInButtonXPATH= "//button[@id='loginButton']";
    public static final String unitedInputFieldCSS= "input[name='loginFormPage.mpInput']";
    public static final String unitedPasswordNAME= "loginFormPage.password";
    public static final String loginPasswordXpath= "//button[@type='submit']//span[contains(text(),'Sign in')]";
    public static final String enterValidNumberXpath="//div[@aria-label='Please enter a valid MileagePlus number.']";


//12th test case Mileage Program  -----------------------------------------------
    public static final String clickOnMileagePlusXpath="//span[normalize-space()='MILEAGEPLUS® PROGRAM']";
    public static final String selectBusinessCreditCardXpath="(//span[normalize-space()='MileagePlus business credit cards'])[1]";

//13th test case Signup Program  ----------------------
/*public static final String unitedLogInButtonXPATH= "//button[@id='loginButton']";
    public static final String unitedInputFieldCSS= "input[name='loginFormPage.mpInput']";
    public static final String unitedPasswordNAME= "loginFormPage.password";
    public static final String loginButtonCSS= "body > div:nth-child(21) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > button:nth-child(5)";
    public static final String invalidMessagePopupXpath= "//div[@class='app-containers-LoginFormContainer-styles__errorMessage--3ASau']";*/


}
