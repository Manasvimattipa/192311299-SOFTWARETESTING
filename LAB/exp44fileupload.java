
package selenium;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exp44fileupload {

    @Test
    public void fileUploadAutomation() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");

        // Create a sample.txt file and replace this path
        // with its actual location on your computer.
        String filePath = "C:\\Users\\hp\\Downloads\\sample.txt";

        driver.findElement(By.id("file-upload")).sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(2000);

        String uploaded = driver.findElement(By.id("uploaded-files")).getText();

        System.out.println("Uploaded File: " + uploaded);

        assertTrue(uploaded.contains("sample.txt"));

        // Browser remains open. Close it manually using X.
    }
}
