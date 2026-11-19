
package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exp41dropdown {

    @Test
    public void dropdownTest() {

        WebDriver driver = new ChromeDriver();

        String path = new File("src/selenium/exp41dropdown.html").getAbsolutePath();
        driver.get("file:///" + path.replace("\\", "/"));

        WebElement dropdown = driver.findElement(By.id("cars"));

        Select select = new Select(dropdown);

        select.selectByVisibleText("Saab");

        String selected = select.getFirstSelectedOption().getText();

        System.out.println("Selected Car: " + selected);

        assertEquals("Saab", selected);
    }
}
