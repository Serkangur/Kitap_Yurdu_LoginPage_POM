package tests;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_011 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test //E-posta alanına fazla karakter girilmesi
    public void login_011() {
        homePage = new HomePage(driver);
        homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
        homePage.clickCookieButton();
        homePage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.loginMailText("dkfsjfksjfdfsdfsfsfsfsdf@gmail.com");
        loginPage.trueloginPasswordText();
        loginPage.clickSubmitButton();
        loginPage.errorTextCheck();
    }
}
