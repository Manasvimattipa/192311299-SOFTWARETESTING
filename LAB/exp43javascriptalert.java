
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exp43javascriptalert {

    @Test
    public void alertHandlingTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        String result = driver.findElement(By.id("result")).getText();

        System.out.println(result);

        assertTrue(result.contains("You successfully clicked an alert"));

        // Browser remains open. Close it manually using X.
    }
}
