package homeworkweek10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String nameOfBrowser = "firefox";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {
        if (nameOfBrowser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (nameOfBrowser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (nameOfBrowser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please enter correct browser name");
        }
        driver.get(baseUrl);//to Launch the URL
        driver.manage().window().maximize();//to maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//throw exception if browser not open in 20 sec.
        String title = driver.getTitle(); //to get title of the webpage
        System.out.println("Title of webpage : " + title);
        System.out.println("Current Url : " + driver.getCurrentUrl());//Get Current Url
        String src = driver.getPageSource();//Get page source
        System.out.println("page source: " + src);
//to find the Email field element by id
        WebElement emailField = driver.findElement(By.id("Email"));//store in WebElement by id
        emailField.sendKeys("jay123@gmail.com");///Sending email to email filed element
        //to find the password field element
        WebElement passwordFeild = driver.findElement(By.name("Password"));//Store in webelement by name
        passwordFeild.sendKeys("Jay@123"); //Sending password to password filed element

        driver.close();//to close the browser
    }
}


