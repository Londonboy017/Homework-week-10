package homeworkweek10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);//to Launch the URL
        driver.manage().window().maximize();//to maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Current Url : "+driver.getCurrentUrl());//Get Current Url
        String title = driver.getTitle();//to get title of the webpage
        System.out.println("Title of webpage : " + title);
        String src = driver.getPageSource();//Get page source
        System.out.println("page source : " + src);
        //to find the Email field element by id
        WebElement username = driver.findElement(By.id("user-name"));//store in WebElement by id
        username.sendKeys("Admin");
        //to find the password field element
        WebElement password = driver.findElement(By.name("password"));//Store in webelement by name
        password.sendKeys("admin123");//Sending password to password filed element

        driver.close();
    }
}
