package books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

import java.util.concurrent.TimeUnit;

public class AllBooksUI extends BaseTest {
    public AllBooksUI(WebDriver driver) {
        super(driver);
    }
    By title;
    public int setTitle(String book){
        if(book.equals("You Don't Know JS")){
            title=By.xpath("//*[contains(@id,'Know JS')]");
        }
        else
            title=By.xpath("//*[contains(@id,'" +book+ "')]");
        return getDriver().findElements(title).size();
    }
}
