package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {
    private final WebDriver driver;
    private final By emailAddressField = By.id("email_create");
    private final By createAnAccountButton = By.id("SubmitCreate");

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public CreateNewAccountPage authenticateEmail(String email) {
        driver.findElement(emailAddressField).sendKeys(email);
        driver.findElement(createAnAccountButton).click();
        return new CreateNewAccountPage(driver);
    }
}
