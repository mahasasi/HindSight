package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooksQA_Test {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        //Instantiating chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\seleniumV1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Opening web application
        driver.get("https://www.demoqa.com/books");

        //Locating the Login button and clicking on it
        driver.findElement(By.id("login")).click();

        //Locating the username & password and passing the credentials
        driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
        driver.findElement(By.id("password")).sendKeys("Password@123");

        //Click on the login button
        driver.findElement(By.id("login")).click();

        //Print the web page heading
        System.out.println("The page title is : " +driver.findElement(By.xpath("//*[@id=\"app\"]//div[@class=\"main-header\"]")).getText());

        //Click on Logout button
        driver.findElement(By.id("submit")).click();

        //Close driver instance
        driver.quit();
    }

}
