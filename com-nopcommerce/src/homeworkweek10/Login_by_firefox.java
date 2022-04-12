package homeworkweek10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Login_by_firefox {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        WebDriver driver =new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Title of webpage : "+driver.getTitle());
        System.out.println("Current Url : "+driver.getCurrentUrl());
        String src = driver.getPageSource();
        System.out.println("Page source : "+src);

        WebElement emailField=driver.findElement(By.id("Email"));

        emailField.sendKeys("ajy@gmail.com");
        WebElement password =driver.findElement(By.name("Password"));
        password.sendKeys("1234sdf");



    }

}
