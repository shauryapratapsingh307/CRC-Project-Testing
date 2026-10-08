package VedioPlay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VedioPlayTest {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.manage().window().maximize();
   
   
            String videoUrl = "https://www.youtube.com/watch?v=wqQk89FHSWU";
            driver.get(videoUrl );

            Thread.sleep(5000);
            WebElement videoPlayer = driver.findElement(By.id("movie_player"));
            
           
            videoPlayer.click();
            System.out.println("Successfully clicked the video player!");
            
   
            Thread.sleep(10000);
            
        } catch (Exception e) {
          
            e.printStackTrace();
        } finally {
            
            driver.quit();
        }
    }
}