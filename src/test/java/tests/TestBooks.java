package tests;

import books.AllBooksUI;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.AllBooksAPI;

import java.util.concurrent.TimeUnit;

public class TestBooks {
    private static final Logger log = Logger.getLogger(TestBooks.class);
    @Test
    public void successViewBooks(){
        WebDriver driver =new ChromeDriver();
        AllBooksUI allBooks= new AllBooksUI(driver);
        AllBooksAPI booksAPI = new AllBooksAPI();
        String [] apiBook= booksAPI.responseParse();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(booksAPI.verifyBookList(),200,"Correct status code returned");
        for(String title:apiBook){
            Assert.assertEquals(1,allBooks.setTitle(title));
        }
    }
}
