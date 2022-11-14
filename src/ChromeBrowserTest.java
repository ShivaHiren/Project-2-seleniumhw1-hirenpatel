import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //object of chrome
        WebDriver driver = new ChromeDriver();

        //Launch Url
        driver.get(baseUrl);

        //Maximise Window
        driver.manage().window().maximize();

        //WE give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);

        //Get the current URL
        System.out.println("Current Url is:" + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //Find email link element
        WebElement userNameField = driver.findElement(By.name("username"));

        //Type email address in email field
        userNameField.sendKeys("Hiren123@orange.com");

        //Find password field
        WebElement passwordField = driver.findElement(By.name("password"));

        //Type password in password field
        passwordField.sendKeys("Hiren123#");

        //Close the browser
        driver.quit();



    }

}
