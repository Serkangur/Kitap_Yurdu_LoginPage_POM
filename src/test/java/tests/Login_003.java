package tests;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_003 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test //Sadece E-posta Hesabı ile Login
    public void login_003() {
        homePage = new HomePage(driver);
        homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
        homePage.clickCookieButton();
        homePage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.trueloginMailText();
        loginPage.clickSubmitButton();
        loginPage.errorTextCheck();
    }
}
