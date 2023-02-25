package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
    }
    public BaseTest(WebDriver driver){
        this.driver = driver;
        driver.get("https://demoqa.com/books");
    }

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void TearDown(){
        driver.quit();
        driver.close();
    }
}
