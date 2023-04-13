package Test;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccounntPage;
import testCase.WebTestBase;


public class TC01 extends WebTestBase {
	MyAccounntPage myAccountPage;
	HomePage homePage;
	LoginPage loginPage;
	
	public TC01()
	{
		super();
	}
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccounntPage();
    }
//for testing the login credential()
    @Test(priority = 0)
    public void verifyLoginWithValidCredential(){
        SoftAssert softAssert = new SoftAssert();
        homePage.userSearchClick();
        loginPage.login(prop.getProperty("mobile"), prop.getProperty("password"));
        softAssert.assertEquals(myAccountPage.getTextOFMYAccountPage(), "My Account", "My Account text should be match");
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void verifySearchBar(){
        SoftAssert softAssert = new SoftAssert();
        myAccountPage.search();
        System.out.println(myAccountPage.getTextOfSearch());
        softAssert.assertEquals(myAccountPage.getTextOfSearch(), "Showing results for \"the power of your subconscious mind\"\n" +
                "254 results found","Showing results for \"the power of your subconscious mind\"\n" +
        "254 results found text should be match");
        myAccountPage.selectDropDown("byVisibleText", "Best Seller");
        softAssert.assertAll();
    }


    @Test(priority = 2)
    public void verifyMouseHover(){
        SoftAssert softAssert = new SoftAssert();
        myAccountPage.mouseHover();
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void verifyScrollDown(){
        SoftAssert softAssert = new SoftAssert();
        myAccountPage.scrollDownMethod();
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void verifyGetWindowHandle(){
        SoftAssert softAssert = new SoftAssert();
        myAccountPage.windowHandle();
        softAssert.assertAll();
    }

    @Test(priority = 5)
    public void verifyCookiesHandle(){
        SoftAssert softAssert = new SoftAssert();
        myAccountPage.getCookiesHandle();
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}


	
