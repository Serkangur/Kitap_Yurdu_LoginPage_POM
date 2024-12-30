package base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getDriver(String url){
        driver.get(url);
    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public  void clickToWebElement (By locator){
        find(locator).click();
    }
    public void textInput(String input,By locator) {
        find(locator).sendKeys(input);
    }
    public void textInputKey(String input,By locator) {
        find(locator).sendKeys(input,Keys.ENTER);
    }

    public void rememberMeClick(By locator){
        if(!find(locator).isSelected()){

            find(locator).click();
        }
    }
    public WebElement isElementDisplayed (By locator){
        WebElement element = driver.findElement(locator);
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
}
