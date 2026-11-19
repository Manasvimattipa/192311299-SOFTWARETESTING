package selenium;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exp40logout {

    @Test
    public void logoutTest() {

        WebDriver driver = new ChromeDriver();

        String path = new File("src/selenium/logout.html").getAbsolutePath();
        driver.get("file:///" + path.replace("\\", "/"));

        driver.findElement(By.id("logout")).click();

        String result = driver.findElement(By.id("message")).getText();

        assertEquals("Login Page Displayed", result);

        driver.quit();
    }
}