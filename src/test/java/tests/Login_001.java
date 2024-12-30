package tests;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_001 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @Test //Geçerli E-posta ve Şifre ile Login
    public void login_001() {
        homePage = new HomePage(driver);
        homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
        homePage.clickCookieButton();
        homePage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.trueloginMailText();
        loginPage.trueloginPasswordText();
        loginPage.clickSubmitButton();



    }

}
