
package selenium;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exp42checkboxradio {

    @Test
    public void checkboxRadioSelection() {

        WebDriver driver = new ChromeDriver();

        String path = new File("src/selenium/exp42checkboxradio.html").getAbsolutePath();
        driver.get("file:///" + path.replace("\\", "/"));

        WebElement checkbox = driver.findElement(By.id("checkbox1"));
        checkbox.click();

        WebElement radioButton = driver.findElement(By.id("radio1"));
        radioButton.click();

        assertTrue(checkbox.isSelected());
        assertTrue(radioButton.isSelected());

        System.out.println("Checkbox selected successfully");
        System.out.println("Radio button selected successfully");

        // Browser remains open. Close it manually using X.
    }
}
