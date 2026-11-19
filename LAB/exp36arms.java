package selenium;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exp36arms {

    @Test
    public void verifyTitle()throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        String path = new File("src/selenium/arms.html").getAbsolutePath();

        driver.get("file:///" + path.replace("\\", "/"));

        String title = driver.getTitle();

        System.out.println("Website Title: " + title);

        assertEquals("ARMS Portal", title);
        
        Thread.sleep(10000);  // Keeps Chrome open for 5 seconds

        driver.quit();
    }
}