package tests;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_002 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test //Beni hatırla Seçeneği ile Login
    public void login_002() {
        homePage = new HomePage(driver);
        homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
        homePage.clickCookieButton();
        homePage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.trueloginMailText();
        loginPage.trueloginPasswordText();
        loginPage.rememberMeClick();
        loginPage.clickSubmitButton();
    }


}
