package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;

import java.time.Duration;
import java.util.Random;

import static utils.DriverFactory.getChromeDriver;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeSuite
    public void setUp() {
        driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    public String getRandomEmail() {
        String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        return salt+"@gmail.com";
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
