import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
        //launch URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //WE give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:" + title);

        //Get the page source
        System.out.println("Page soruce is:" + driver.getPageSource());

        //Find the email link element
        WebElement userNameField = driver.findElement(By.name("username"));

        //Type email in email field
        userNameField.sendKeys("Hiren123@orange.com");

        //Find password link element
        WebElement passwordField = driver.findElement(By.name("password"));

        //Type password in password field
        passwordField.sendKeys("Hiren123#");

        //Close the browser
        driver.quit();
    }
}

