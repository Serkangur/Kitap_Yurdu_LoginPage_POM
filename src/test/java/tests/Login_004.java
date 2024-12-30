package tests;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_004 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test //Geçerli E-posta ve Yanlış Şifre ile Login
    public void login_004() {
        homePage = new HomePage(driver);
        homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
        homePage.clickCookieButton();
        homePage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.trueloginMailText();
        loginPage.loginPasswordText("123456");
        loginPage.clickSubmitButton();
        loginPage.errorTextCheck();
    }
}
