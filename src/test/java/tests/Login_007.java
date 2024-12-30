package tests;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_007 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test //E-posta Önde ve Arkada Boşluk ile Login
    public void login_007() {
        homePage = new HomePage(driver);
        homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
        homePage.clickCookieButton();
        homePage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.loginMailText(" serkangur111@gmail.com ");
        loginPage.trueloginPasswordText();
        loginPage.clickSubmitButton();
        loginPage.errorTextCheck();
    }
}
