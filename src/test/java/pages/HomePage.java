package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class HomePage extends BaseTest {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By loginButton= By.id("login");
    By userNameLogIn=By.id("userName-value");
    public void clickOnLoginButton(){
        getDriver().findElement(loginButton).click();
    }
    public String isUserLogIn(){
        WebElement element = getDriver().findElement(userNameLogIn);
        System.out.println(element.getCssValue("element"));
        return element.getCssValue("element");

    }
}
