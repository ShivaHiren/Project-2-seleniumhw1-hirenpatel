import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");

        //object for firefox
        WebDriver driver = new FirefoxDriver();

        //launch URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //WE give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:" + title);

        //Get the current URL
        System.out.println("Current Url is:" + driver.getCurrentUrl());

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
