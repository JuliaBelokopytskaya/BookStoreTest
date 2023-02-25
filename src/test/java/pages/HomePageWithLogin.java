package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class HomePageWithLogin extends BaseTest {
    public HomePageWithLogin(WebDriver driver) {
        super(driver);
    }
    By userNameLogOut=By.id("submit");
    By heading=By.tagName("h5");
    By userNameLogIn=By.id("userName-value");
    public void clickLogOut(){
        getDriver().findElement(userNameLogOut).click();
    }
    public String isUserLogOut(){
        return getDriver().findElement(heading).getText();
    }

    public String isUserLogIn(){
        return getDriver().findElement(userNameLogIn).getText();
    }
}
