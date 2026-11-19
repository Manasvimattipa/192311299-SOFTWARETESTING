
package selenium;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exp45screenshot {

    @Test
    public void captureScreenshot() throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");
        Thread.sleep(3000);

        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File(
            "C:\\Users\\hp\\Downloads\\selenium_screenshot.png"
        );

        Files.copy(source.toPath(), destination.toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        System.out.println("Screenshot saved successfully");

        assertTrue(destination.exists());

        // Browser remains open. Close it manually using X.
    }
}
