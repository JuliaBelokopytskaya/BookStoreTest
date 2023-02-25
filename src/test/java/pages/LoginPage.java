package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class LoginPage extends BaseTest {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By heading=By.tagName("h5");
    By loginUser_name= By.id("userName");
    By loginPassword=By.id("password");
    By loginButton= By.id("login");
    public void set_userName(String user_name){
        getDriver().findElement(loginUser_name).sendKeys(user_name);
    }

    public void set_password(String password){
        getDriver().findElement(loginPassword).sendKeys(password);
    }
    public void clickOnLogButton(){
        getDriver().findElement(loginButton).click();
    }
    public void scrolling() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500)");
    }
    public String isPageOpened(){
        return getDriver().findElement(heading).getText();
    }
}



