package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BlousesCategoryPage {
    private final WebDriver driver;
    private final By resultedProductLocator = By.xpath("//img[@title='Blouse']");
    private final By addToCartButtonLocator = By.xpath("//a[@title='Add to cart']");
    private final By proceedToCheckOutButtonLocator = By.xpath("//a[@title='Proceed to checkout']");
    public BlousesCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public BlousesCategoryPage addToCart(){
        Actions actions = new Actions(driver);
        WebElement blouse = driver.findElement(resultedProductLocator);
        actions.moveToElement(blouse).perform();
        driver.findElement(addToCartButtonLocator).click();
        return this;
    }

    public OrderPage proceedToCheckOut(){
        driver.findElement(proceedToCheckOutButtonLocator).click();
        return new OrderPage(driver);
    }

}
