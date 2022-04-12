package homeworkweek10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Current Url : "+driver.getCurrentUrl());
        String title = driver.getTitle();
        System.out.println("Title of webpage : " + title);
        String src = driver.getPageSource();
        System.out.println("page source : " + src);
        WebElement username = driver.findElement(By.id("user[email]"));
        username.sendKeys("Admin@yahoo.com");
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("admin123");

        driver.close();
    }

}
