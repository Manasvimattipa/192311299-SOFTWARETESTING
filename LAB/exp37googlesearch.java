package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exp37googlesearch {

    @Test
    public void googleSearchTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q"))
              .sendKeys("what is software testing" + Keys.ENTER);

        Thread.sleep(10000);

        assertTrue(driver.getTitle().toLowerCase().contains("what is software testing"));

        driver.quit();
    }
}