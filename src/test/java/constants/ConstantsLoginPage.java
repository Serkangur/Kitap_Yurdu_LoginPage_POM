package constants;

import org.openqa.selenium.By;

public class ConstantsLoginPage {
    public static By emailTextBox = By.xpath("//input[@id=\"login-email\"]");
    public static By passwordTextBox = By.xpath("//input[@id=\"login-password\"]");
    public static By submitButton = By.xpath("//button[@role=\"button\"]");
    public static By rememberMe= By.xpath("//div[@class=\"ky-checkbox-input\"]");
    public static By errorText = By.xpath("//div[@class=\"ky-error\"]");

}
