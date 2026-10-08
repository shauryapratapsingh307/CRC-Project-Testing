package Search_button_testing;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest {

    @Test
    void testValidSearch() {

        WebDriver driver = new ChromeDriver();

    
        driver.get("https://www.Youtube.com");

        // Type a valid keyword
        driver.findElement(By.name("q"))
                .sendKeys("Java");

        // Click the search button
        driver.findElement(By.name("btnK"))
                .click();

        // Get page content
        String pageText = driver.getPageSource();

        // Check that Java appears in the result
        assertTrue(
                pageText.contains("Java"),
                "Search result was not found"
        );

        // Close the browser
        driver.quit();
    }
}