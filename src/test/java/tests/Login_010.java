package tests;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_010 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test //Şifre Önde ve Arkada Boşluk ile Login
    public void test010() {
        homePage = new HomePage(driver);
        homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
        homePage.clickCookieButton();
        homePage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.trueloginMailText();
        loginPage.loginPasswordText(" Serkan_23 ");
        loginPage.clickSubmitButton();
        loginPage.errorTextCheck();
    }
}
