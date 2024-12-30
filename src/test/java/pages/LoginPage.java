package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.ConstantsLoginPage.*;


public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void trueloginMailText(){
        textInput("serkangur111@gmail.com",emailTextBox);
    }

    public void loginMailText(String txt){
        textInput(txt,emailTextBox);
    }


    public void trueloginPasswordText(){
        textInput("Serkan_23",passwordTextBox);
    }
    public void loginPasswordText(String password){
        textInput(password,passwordTextBox);
    }


    public void clickSubmitButton(){
        clickToWebElement(submitButton);
    }

    public void rememberMeClick(){
        rememberMeClick(rememberMe);
    }

    public WebElement errorTextCheck(){
      return isElementDisplayed(errorText);
    }

}
