package tests;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_006 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test //Boş Kullanıcı Alanı ile Login
    public void login_006() {
        homePage = new HomePage(driver);
        homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
        homePage.clickCookieButton();
        homePage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.trueloginPasswordText();
        loginPage.clickSubmitButton();
        loginPage.errorTextCheck();
    }
}
