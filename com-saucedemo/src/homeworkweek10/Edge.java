package homeworkweek10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {

    String baseUrl = "https://www.saucedemo.com/";
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
    WebElement username = driver.findElement(By.id("user-name"));
    username.sendKeys("Admin");
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("admin123");

    driver.close();
}

}
