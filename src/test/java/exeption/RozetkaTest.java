package exeption;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RozetkaTest extends BaseTest {

    @Test
    public void search() {
        openUrl("https://rozetka.com.ua/");
        try {
//             //input[@name='search']  true;
            WebElement search = driver.findElement(By.xpath("//input[@name='earch']"));

            search.click();
            search.sendKeys("iphone");
            search.sendKeys(Keys.ENTER);
        } catch (NoSuchElementException e) {
            System.out.println("Exception NoSuchElementException: " + e);
        }catch (Exception ex){
            System.out.println("Simple Exception: " + ex);
        }
    }
}
