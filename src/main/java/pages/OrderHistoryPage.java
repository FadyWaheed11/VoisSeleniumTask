package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage {
    private final WebDriver driver;
    private final By orderTableLocator = By.id("order-list");
    public OrderHistoryPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean orderIsVisible() {
        return driver.findElement(orderTableLocator).isDisplayed();
    }
}
