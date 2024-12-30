package tests;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_008 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test //E-posta Adresine Özel Karakterler Yazarak Login
    public void login_008() {
        homePage = new HomePage(driver);
        homePage.getDriver("https://www.kitapyurdu.com/index.php?route=common/home");
        homePage.clickCookieButton();
        homePage.clickLoginButton();

        loginPage = new LoginPage(driver);
        loginPage.loginMailText("☐☐☐serkangur111@gmail.com");
        loginPage.trueloginPasswordText();
        loginPage.clickSubmitButton();
        loginPage.errorTextCheck();
    }


}
