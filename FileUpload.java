import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.time.Duration;

public class FileUpload {

   public  WebDriver driver;
    @Test(priority = 1)
    public void setUp() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        WebDriverManager.edgedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.ilovepdf.com/word_to_pdf");
        Thread.sleep(4);
       Actions actions = new Actions(driver);
       WebElement pickFiles =  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/a[1]/span[1]"));
       actions.moveToElement(pickFiles).perform();
      pickFiles.sendKeys("C:\\Users\\Sydney_Aghanchi\\Desktop\\Apprasial doc\\Client Assessment (1).docx");
       Thread.sleep(100);
     // driver.findElement(By.id("file-submit")).click();



       Thread.sleep(60);
    }
}
