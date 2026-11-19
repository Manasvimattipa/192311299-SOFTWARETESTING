package selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exp38registration {

    @Test
    public void registerUser() {

        WebDriver driver = new ChromeDriver();

        String path = new File("src/selenium/registration.html").getAbsolutePath();

        driver.get("file:///" + path.replace("\\", "/"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

        wait.until(ExpectedConditions.textToBe(
            By.id("message"), "Registration Successful"));

        assertEquals("Registration Successful",
            driver.findElement(By.id("message")).getText());

        // No driver.quit() here.
        // Close Chrome manually using X.
    }
}