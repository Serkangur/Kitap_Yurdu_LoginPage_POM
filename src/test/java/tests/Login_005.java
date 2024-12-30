package tests;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_005 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test //Geçerli Şifre ve Yanlış E-posta ile Login
    public void login_005() {
        homePage = new HomePage(driver);
        homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
        homePage.clickCookieButton();
        homePage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.loginMailText("random@gmail.com");
        loginPage.trueloginPasswordText();
        loginPage.clickSubmitButton();
        loginPage.errorTextCheck();
    }
}
