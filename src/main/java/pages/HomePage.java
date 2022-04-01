package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final By signInButtonLocator = By.linkText("Sign in");
    private final By orderHistoryButtonLocator = By.xpath("//a[@title='Orders']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public AuthenticationPage clickOnSignIn() {

        driver.findElement(signInButtonLocator).click();
        return new AuthenticationPage(driver);
    }

    public OrderHistoryPage clickOnOrderHistory() {
        driver.findElement(orderHistoryButtonLocator).click();
        return new OrderHistoryPage(driver);
    }
}
