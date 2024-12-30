package tests;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_009 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test
    public void login_009() {
        homePage = new HomePage(driver);
        homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
        homePage.clickCookieButton();
        homePage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.loginMailText("random@gmail.com");
        loginPage.loginPasswordText("123456");
        loginPage.clickSubmitButton();
        loginPage.errorTextCheck();
    }
}
