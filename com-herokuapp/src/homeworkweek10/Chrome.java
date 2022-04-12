package homeworkweek10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Title of webpage :"+driver.getTitle());
        System.out.println("current url : "+driver.getCurrentUrl());
        String src =driver.getPageSource();
        System.out.println("page source: "+src);
        WebElement email=driver.findElement(By.name("username"));
        email.sendKeys("jay123@gmail.com");
        WebElement pswrd=driver.findElement(By.id("password"));
        pswrd.sendKeys("1234abc");

        driver.close();
}
}
