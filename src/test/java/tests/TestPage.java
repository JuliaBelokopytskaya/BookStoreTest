package tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HomePageWithLogin;
import pages.LoginPage;

public class TestPage {
    private static final Logger log = Logger.getLogger(TestPage.class);
    @Test
    public void successLogIn() throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        HomePage home = new HomePage(driver);
        LoginPage loginPage =new LoginPage(driver);
        HomePageWithLogin homeLogin = new HomePageWithLogin(driver);
        home.clickOnLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/login");
        loginPage.set_userName("Julia");
        loginPage.set_password("Ju1@Ju1@");
        loginPage.scrolling();
        loginPage.clickOnLogButton();
        Thread.sleep(1000);
        Assert.assertEquals(homeLogin.isUserLogIn(),"Julia");
        homeLogin.clickLogOut();
        Assert.assertEquals(homeLogin.isUserLogOut(),"Login in Book Store");

    }
}
